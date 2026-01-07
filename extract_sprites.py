"""
提取Runner626的.is/.ibs sprite文件
根据f.java中的解析逻辑实现
"""

import struct
import os
from PIL import Image
import io


def read_short(f):
    """读取大端序short"""
    return struct.unpack('>h', f.read(2))[0]


def read_byte(f):
    """读取signed byte"""
    return struct.unpack('b', f.read(1))[0]


def read_ubyte(f):
    """读取unsigned byte"""
    return struct.unpack('B', f.read(1))[0]


def extract_is_file(filepath, output_dir):
    """提取.is文件中的sprite"""
    filename = os.path.basename(filepath)
    print(f"\n{'='*60}")
    print(f"提取: {filename}")
    print('='*60)
    
    with open(filepath, 'rb') as f:
        # 读取头部 - 检查魔数 "IBS\x00\x01"
        magic = f.read(5)
        if magic != b'IBS\x00\x01':
            print(f"  ❌ 无效的IBS格式: {magic}")
            return
        
        # 读取sprite数量和类型
        num_sprites = read_short(f)
        sprite_type = read_byte(f)  # b字段: 0=内嵌图片, 其他=索引颜色
        
        print(f"  Sprite数量: {num_sprites}")
        print(f"  类型: {sprite_type} ({'内嵌PNG/GIF' if sprite_type == 0 else '索引颜色'})")
        
        # 如果有调色板 (sprite_type != 0)
        palette = None
        if sprite_type != 0:
            palette_size = read_short(f)  # c字段 - 调色板颜色数
            num_palettes = read_byte(f)   # 调色板组数
            print(f"  调色板: {num_palettes}组, 每组{palette_size}色")
            
            # 读取所有调色板
            palettes = []
            for p in range(num_palettes):
                pal = []
                for c in range(palette_size):
                    color = read_short(f)
                    pal.append(color)
                palettes.append(pal)
            
            # 使用第一个调色板
            palette = palettes[0] if palettes else None
        
        # 创建输出目录
        sprite_dir = os.path.join(output_dir, filename.replace('.is', '').replace('.ibs', ''))
        os.makedirs(sprite_dir, exist_ok=True)
        
        # 读取sprite数据
        widths = []
        heights = []
        images = []
        
        if sprite_type == 0:
            # 内嵌PNG/GIF图片
            for i in range(num_sprites):
                data_len = read_short(f)
                img_data = f.read(data_len)
                
                try:
                    img = Image.open(io.BytesIO(img_data))
                    img = img.convert('RGBA')
                    widths.append(img.width)
                    heights.append(img.height)
                    images.append(img)
                except Exception as e:
                    print(f"  ⚠️ Sprite {i} 解析失败: {e}")
                    widths.append(0)
                    heights.append(0)
                    images.append(None)
        else:
            # 索引颜色数据
            for i in range(num_sprites):
                w = read_short(f)
                h = read_short(f)
                data_len = read_short(f)
                pixel_data = f.read(data_len)
                
                widths.append(w)
                heights.append(h)
                
                # 解码像素数据
                img = decode_indexed_sprite(w, h, pixel_data, palette, sprite_type)
                images.append(img)
        
        # 保存图片
        saved_count = 0
        for i, img in enumerate(images):
            if img:
                output_path = os.path.join(sprite_dir, f'sprite_{i:03d}.png')
                img.save(output_path)
                saved_count += 1
        
        print(f"  ✅ 保存 {saved_count}/{num_sprites} 个sprite到: {sprite_dir}")
        
        # 生成sprite sheet
        if images and any(img is not None for img in images):
            create_sprite_sheet(images, widths, heights, sprite_dir, filename)
        
        return images, widths, heights


def decode_indexed_sprite(width, height, data, palette, sprite_type):
    """解码索引颜色的sprite数据"""
    if not palette or width <= 0 or height <= 0:
        return None
    
    # 创建RGBA图像
    img = Image.new('RGBA', (width, height), (0, 0, 0, 0))
    pixels = img.load()
    
    # 根据sprite_type解码
    # type 2 使用16色调色板 (4bit索引)
    # 其他使用完整调色板 (8bit索引)
    
    total_pixels = width * height
    decoded = []
    
    if sprite_type == 2:
        # 4bit压缩 - 每个字节包含2个像素索引
        i = 0
        while len(decoded) < total_pixels and i < len(data):
            b = data[i] if isinstance(data[i], int) else ord(data[i])
            
            # 检查压缩标记
            if b >= 128:
                # 特殊压缩编码
                cmd = b - 256 if b >= 128 else b
                if cmd == -128:  # 单个8bit索引
                    i += 1
                    if i < len(data):
                        idx = data[i] if isinstance(data[i], int) else ord(data[i])
                        decoded.append(idx)
                elif cmd == -127:  # 两个4bit索引
                    i += 1
                    if i < len(data):
                        b2 = data[i] if isinstance(data[i], int) else ord(data[i])
                        decoded.append((b2 >> 4) & 0x0F)
                        decoded.append(b2 & 0x0F)
                else:
                    # 其他压缩模式 - 简化处理
                    decoded.append(0)
            else:
                # 直接索引
                decoded.append(b)
            i += 1
    else:
        # 8bit索引
        for b in data:
            idx = b if isinstance(b, int) else ord(b)
            decoded.append(idx & 0xFF)
    
    # 填充像素
    for y in range(height):
        for x in range(width):
            idx = y * width + x
            if idx < len(decoded):
                color_idx = decoded[idx]
                if color_idx < len(palette):
                    # 转换16位颜色 (通常是 RGB565 或 ARGB4444)
                    color16 = palette[color_idx]
                    r, g, b, a = convert_color16(color16)
                    pixels[x, y] = (r, g, b, a)
    
    return img


def convert_color16(color16):
    """转换16位颜色到RGBA
    J2ME通常使用 0xAARRGGBB 的int格式或 RGB565/ARGB4444
    这里的short是有符号的，需要处理
    """
    # 处理有符号short
    if color16 < 0:
        color16 = color16 & 0xFFFF
    
    # 尝试 ARGB4444 格式 (常用于J2ME)
    # 格式: AAAA RRRR GGGG BBBB
    a = ((color16 >> 12) & 0x0F) * 17  # 扩展到0-255
    r = ((color16 >> 8) & 0x0F) * 17
    g = ((color16 >> 4) & 0x0F) * 17
    b = (color16 & 0x0F) * 17
    
    # 如果alpha为0，设为透明
    if a == 0 and color16 != 0:
        a = 255  # 非零颜色默认不透明
    
    # 特殊处理：如果是纯0，视为透明
    if color16 == 0:
        return (0, 0, 0, 0)
    
    return (r, g, b, a)


def create_sprite_sheet(images, widths, heights, output_dir, filename):
    """创建sprite sheet"""
    valid_images = [(i, img) for i, img in enumerate(images) if img]
    if not valid_images:
        return
    
    # 找最大尺寸
    max_w = max(widths) if widths else 16
    max_h = max(heights) if heights else 16
    if max_w <= 0:
        max_w = 16
    if max_h <= 0:
        max_h = 16
    
    # 计算网格
    cols = min(16, len(valid_images))
    rows = (len(valid_images) + cols - 1) // cols
    
    # 创建sheet
    sheet_w = cols * (max_w + 2)
    sheet_h = rows * (max_h + 2)
    sheet = Image.new('RGBA', (sheet_w, sheet_h), (100, 100, 100, 255))
    
    for idx, (i, img) in enumerate(valid_images):
        col = idx % cols
        row = idx // cols
        x = col * (max_w + 2) + 1
        y = row * (max_h + 2) + 1
        
        # 居中放置
        offset_x = (max_w - img.width) // 2
        offset_y = (max_h - img.height) // 2
        sheet.paste(img, (x + offset_x, y + offset_y), img)
    
    sheet_path = os.path.join(output_dir, f'_sheet.png')
    sheet.save(sheet_path)
    print(f"  📋 Sprite Sheet: {sheet_path} ({sheet_w}x{sheet_h})")


def main():
    resources_dir = 'source/resources'
    output_dir = 'extracted_sprites'
    os.makedirs(output_dir, exist_ok=True)
    
    print("="*60)
    print("🎨 Runner626 Sprite提取器")
    print("="*60)
    
    # 查找所有.is文件
    is_files = []
    for f in os.listdir(resources_dir):
        if f.endswith('.is') or f.endswith('.ibs'):
            is_files.append(os.path.join(resources_dir, f))
    
    print(f"\n找到 {len(is_files)} 个sprite文件")
    
    # 优先提取地形sprite
    priority = ['plano1.is', 'plano2.is', 'plano3.is', 'plano4.is']
    is_files.sort(key=lambda x: (os.path.basename(x) not in priority, x))
    
    for filepath in is_files:
        try:
            extract_is_file(filepath, output_dir)
        except Exception as e:
            print(f"  ❌ 提取失败: {e}")
            import traceback
            traceback.print_exc()
    
    print(f"\n{'='*60}")
    print(f"✅ 完成！Sprite保存到: {output_dir}/")
    print('='*60)


if __name__ == '__main__':
    main()
