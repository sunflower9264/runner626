"""
Runner626 地图生成器 - 复原Java游戏的地图生成逻辑
根据反编译的c.java代码实现
"""

import struct
import os
from PIL import Image, ImageDraw, ImageFont
import numpy as np


class MapGenerator:
    """地图生成器类"""
    
    # 块序列定义 (对应c.java中的f87b)
    CHUNK_SEQUENCES = [
        [0, 1, 3, 2, 4, 5],              # 关卡0
        [4, 3, 2, 0, 1, 5],              # 关卡1
        [3, 0, 4, 1, 3, 2, 5],           # 关卡2
        [0, 1, 2, 3, 4, 5],              # 关卡3
        [2, 4, 1, 0, 3, 5],              # 关卡4
        [1, 4, 1, 2, 0, 3, 5],           # 关卡5
        [0, 1, 2, 3, 4, 5],              # 关卡6
        [4, 2, 0, 3, 1, 4, 5],           # 关卡7
        [3, 0, 2, 1, 4, 0, 5],           # 关卡8
        [0, 1, 2, 3, 4, 5],              # 关卡9
        [4, 2, 0, 3, 1, 4, 5],           # 关卡10
        [3, 0, 2, 1, 4, 0, 5],           # 关卡11
        [0, 1, 2, 3, 4, 5],              # 关卡12
        [2, 0, 4, 4, 3, 1, 5],           # 关卡13
        [4, 0, 3, 1, 4, 2, 0, 5],        # 关卡14
        [0, 4, 2, 1, 3, 4, 3, 5],        # 关卡15
    ]
    
    # Tile类型颜色映射
    TILE_COLORS = {
        0: (255, 255, 255, 0),      # 空气 - 透明
        1: (139, 69, 19),           # 普通地面 - 棕色
        2: (160, 82, 45),           # 地面变种
        7: (105, 105, 105),         # 金属平台 - 灰色
        8: (105, 105, 105),         
        9: (105, 105, 105),
        10: (105, 105, 105),
        11: (105, 105, 105),
        12: (169, 169, 169),        # 可切换平台
        13: (100, 100, 120),        # 特殊平台
        18: (140, 140, 160),
        21: (255, 0, 0),            # 尖刺 - 红色
        22: (255, 50, 50),
        23: (255, 165, 0),          # 可站立平台 - 橙色
        28: (0, 255, 0),            # 地面顶部 - 绿色
        29: (0, 200, 0),
        30: (0, 180, 0),
        31: (0, 160, 0),
        32: (0, 140, 0),
        35: (200, 0, 0),            # 陷阱
        39: (220, 0, 0),
        41: (255, 200, 0),          # 特殊平台
        48: (180, 0, 0),            # 尖刺陷阱
        50: (200, 50, 0),
        54: (128, 128, 128),        # 墙壁
        62: (64, 224, 208),         # 水/液体
        63: (64, 200, 200),
        64: (64, 180, 180),
        68: (255, 215, 0),          # 可收集物品
        69: (255, 223, 0),
        70: (255, 231, 0),
        82: (100, 100, 100),        # 障碍物
        89: (150, 75, 0),           # 可破坏物体
        95: (220, 220, 220),        # 装饰物
        102: (170, 85, 0),          # 可破坏箱子
        131: (190, 0, 0),           # 特殊陷阱
        132: (180, 90, 0),
    }
    
    def __init__(self, resources_dir):
        self.resources_dir = resources_dir
        self.chunks = None
        self.chunk_width = 0
        self.chunk_height = 0
        self.enemies = None
        self.obstacles = None
        self.collectibles = None
        
    def load_stage(self, stage_file):
        """加载stage.bin文件，对应c.java的a(String str)方法"""
        filepath = os.path.join(self.resources_dir, stage_file)
        
        print(f"📂 正在加载: {stage_file}")
        
        with open(filepath, 'rb') as f:
            # 读取块数量和维度
            num_chunks = struct.unpack('>i', f.read(4))[0]  # Java int是大端序
            self.chunk_width = struct.unpack('>i', f.read(4))[0]
            self.chunk_height = struct.unpack('>i', f.read(4))[0]
            
            print(f"  块数量: {num_chunks}")
            print(f"  块尺寸: {self.chunk_width} x {self.chunk_height} tiles")
            
            # 读取地形块数据 (f86a)
            self.chunks = []
            for i in range(num_chunks):
                chunk = np.zeros((self.chunk_height, self.chunk_width), dtype=np.int16)
                for y in range(self.chunk_height):
                    for x in range(self.chunk_width):
                        tile_value = struct.unpack('b', f.read(1))[0]  # signed byte
                        if tile_value < 0:
                            tile_value += 256  # 转换为unsigned
                        chunk[y, x] = tile_value
                self.chunks.append(chunk)
            
            # 读取敌人位置 (f82a) - 分两步：先读所有数量，再读所有数据
            self.enemies = []
            enemy_counts = []
            for i in range(num_chunks):
                count = struct.unpack('>i', f.read(4))[0]
                enemy_counts.append(count)
                self.enemies.append([])
            
            for i in range(num_chunks):
                for j in range(enemy_counts[i]):
                    enemy_type = struct.unpack('b', f.read(1))[0]
                    enemy_x = struct.unpack('b', f.read(1))[0]
                    enemy_y = struct.unpack('b', f.read(1))[0]
                    self.enemies[i].append([enemy_type, enemy_x, enemy_y])
            
            # 读取障碍物位置 (f83b)
            self.obstacles = []
            obstacle_counts = []
            for i in range(num_chunks):
                count = struct.unpack('>i', f.read(4))[0]
                obstacle_counts.append(count)
                self.obstacles.append([])
            
            for i in range(num_chunks):
                for j in range(obstacle_counts[i]):
                    obs_type = struct.unpack('b', f.read(1))[0]
                    obs_x = struct.unpack('b', f.read(1))[0]
                    obs_y = struct.unpack('b', f.read(1))[0]
                    self.obstacles[i].append([obs_type, obs_x, obs_y])
            
            # 读取收集品位置 (f84c)
            self.collectibles = []
            collectible_counts = []
            for i in range(num_chunks):
                count = struct.unpack('>i', f.read(4))[0]
                collectible_counts.append(count)
                self.collectibles.append([])
            
            for i in range(num_chunks):
                for j in range(collectible_counts[i]):
                    col_type = struct.unpack('b', f.read(1))[0]
                    col_x = struct.unpack('b', f.read(1))[0]
                    col_y = struct.unpack('b', f.read(1))[0]
                    self.collectibles[i].append([col_type, col_x, col_y])
        
        print(f"✅ 加载完成！共 {num_chunks} 个地形块")
        return num_chunks
    
    def get_tile_color(self, tile_value):
        """根据tile值获取颜色"""
        if tile_value in self.TILE_COLORS:
            return self.TILE_COLORS[tile_value]
        # 默认颜色 - 深灰色
        return (80, 80, 80, 255)
    
    def render_chunk(self, chunk_index, tile_size=8):
        """渲染单个地形块"""
        if chunk_index >= len(self.chunks):
            return None
        
        chunk = self.chunks[chunk_index]
        height, width = chunk.shape
        
        # 创建图像
        img = Image.new('RGBA', (width * tile_size, height * tile_size), (135, 206, 235, 255))
        draw = ImageDraw.Draw(img)
        
        # 绘制地形
        for y in range(height):
            for x in range(width):
                tile_value = chunk[y, x]
                if tile_value != 0:  # 跳过空气
                    color = self.get_tile_color(tile_value)
                    x1 = x * tile_size
                    y1 = y * tile_size
                    x2 = x1 + tile_size
                    y2 = y1 + tile_size
                    draw.rectangle([x1, y1, x2, y2], fill=color, outline=(0, 0, 0, 100))
        
        # 绘制敌人
        if chunk_index < len(self.enemies):
            for enemy in self.enemies[chunk_index]:
                ex, ey = enemy[1], enemy[2]
                if 0 <= ex < width and 0 <= ey < height:
                    x1 = ex * tile_size
                    y1 = ey * tile_size
                    draw.ellipse([x1, y1, x1 + tile_size, y1 + tile_size], 
                                fill=(255, 0, 0, 200), outline=(128, 0, 0))
                    draw.text((x1 + 2, y1), 'E', fill=(255, 255, 255))
        
        # 绘制障碍物
        if chunk_index < len(self.obstacles):
            for obstacle in self.obstacles[chunk_index]:
                ox, oy = obstacle[1], obstacle[2]
                if 0 <= ox < width and 0 <= oy < height:
                    x1 = ox * tile_size
                    y1 = oy * tile_size
                    draw.rectangle([x1, y1, x1 + tile_size, y1 + tile_size], 
                                 fill=(128, 0, 128, 200), outline=(64, 0, 64))
        
        # 绘制收集品
        if chunk_index < len(self.collectibles):
            for collectible in self.collectibles[chunk_index]:
                cx, cy = collectible[1], collectible[2]
                if 0 <= cx < width and 0 <= cy < height:
                    x1 = cx * tile_size
                    y1 = cy * tile_size
                    draw.ellipse([x1 + 2, y1 + 2, x1 + tile_size - 2, y1 + tile_size - 2], 
                                fill=(255, 215, 0, 220), outline=(255, 165, 0))
        
        return img
    
    def generate_level_map(self, level_index, tile_size=8, output_dir='output'):
        """根据关卡索引生成完整地图"""
        if level_index >= len(self.CHUNK_SEQUENCES):
            print(f"❌ 关卡索引 {level_index} 超出范围")
            return None
        
        sequence = self.CHUNK_SEQUENCES[level_index]
        print(f"\n🎮 生成关卡 {level_index} - 块序列: {sequence}")
        
        # 渲染每个块
        chunk_images = []
        for i, chunk_idx in enumerate(sequence):
            if chunk_idx < len(self.chunks):
                img = self.render_chunk(chunk_idx, tile_size)
                if img:
                    chunk_images.append(img)
                    print(f"  ✓ 块 {i}: #{chunk_idx} ({img.width}x{img.height})")
        
        if not chunk_images:
            return None
        
        # 水平拼接所有块
        total_width = sum(img.width for img in chunk_images)
        max_height = max(img.height for img in chunk_images)
        
        # 创建完整地图
        full_map = Image.new('RGBA', (total_width, max_height), (135, 206, 235, 255))
        
        x_offset = 0
        for img in chunk_images:
            full_map.paste(img, (x_offset, 0))
            x_offset += img.width
        
        # 添加标题
        draw = ImageDraw.Draw(full_map)
        try:
            font = ImageFont.truetype("arial.ttf", 20)
        except:
            font = ImageFont.load_default()
        
        title = f"Level {level_index} - Chunk Sequence: {sequence}"
        draw.text((10, 10), title, fill=(255, 255, 255), stroke_width=2, stroke_fill=(0, 0, 0))
        
        # 保存图像
        os.makedirs(output_dir, exist_ok=True)
        output_path = os.path.join(output_dir, f'level_{level_index}_map.png')
        full_map.save(output_path)
        print(f"💾 保存地图: {output_path} ({full_map.width}x{full_map.height})")
        
        return full_map
    
    def generate_all_chunks(self, tile_size=8, output_dir='output'):
        """生成所有单独的地形块图片"""
        os.makedirs(output_dir, exist_ok=True)
        
        print(f"\n📦 生成所有地形块...")
        for i in range(len(self.chunks)):
            img = self.render_chunk(i, tile_size)
            if img:
                output_path = os.path.join(output_dir, f'chunk_{i}.png')
                img.save(output_path)
                print(f"  ✓ 块 {i}: {img.width}x{img.height} -> {output_path}")
    
    def generate_tile_legend(self, output_dir='output'):
        """生成tile类型图例"""
        tile_size = 20
        padding = 5
        
        # 获取所有唯一的tile类型
        unique_tiles = set()
        for chunk in self.chunks:
            unique_tiles.update(np.unique(chunk))
        unique_tiles = sorted(list(unique_tiles))
        
        # 创建图例
        legend_width = 400
        row_height = tile_size + padding
        legend_height = len(unique_tiles) * row_height + 20
        
        img = Image.new('RGB', (legend_width, legend_height), (255, 255, 255))
        draw = ImageDraw.Draw(img)
        
        try:
            font = ImageFont.truetype("arial.ttf", 12)
        except:
            font = ImageFont.load_default()
        
        draw.text((10, 5), "Tile Type Legend", fill=(0, 0, 0), font=font)
        
        y = 25
        for tile_value in unique_tiles:
            if tile_value == 0:
                continue
            
            color = self.get_tile_color(tile_value)[:3]  # RGB only
            draw.rectangle([10, y, 10 + tile_size, y + tile_size], fill=color, outline=(0, 0, 0))
            
            text = f"Tile {tile_value}"
            draw.text((40, y + 3), text, fill=(0, 0, 0), font=font)
            
            y += row_height
        
        output_path = os.path.join(output_dir, 'tile_legend.png')
        img.save(output_path)
        print(f"\n📊 Tile图例: {output_path}")


def main():
    """主函数"""
    print("=" * 60)
    print("🎮 Runner626 地图生成器")
    print("=" * 60)
    
    resources_dir = 'resources'
    output_dir = 'map_output'
    
    # 检查资源目录
    if not os.path.exists(resources_dir):
        print(f"❌ 找不到资源目录: {resources_dir}")
        return
    
    # 处理所有stage文件
    stage_files = [f'stage{i}.bin' for i in range(5)]
    
    for stage_file in stage_files:
        stage_path = os.path.join(resources_dir, stage_file)
        if not os.path.exists(stage_path):
            print(f"⚠️  跳过不存在的文件: {stage_file}")
            continue
        
        print(f"\n{'=' * 60}")
        print(f"🗺️  处理 {stage_file}")
        print('=' * 60)
        
        # 创建地图生成器
        gen = MapGenerator(resources_dir)
        
        try:
            # 加载stage数据
            num_chunks = gen.load_stage(stage_file)
            
            # 生成所有单独的块
            stage_num = stage_file.replace('stage', '').replace('.bin', '')
            chunk_dir = os.path.join(output_dir, f'stage{stage_num}_chunks')
            gen.generate_all_chunks(tile_size=8, output_dir=chunk_dir)
            
            # 生成tile图例
            gen.generate_tile_legend(output_dir=chunk_dir)
            
            # 根据该stage生成所有相关关卡
            print(f"\n🎯 生成使用 {stage_file} 的关卡...")
            stage_index = int(stage_num)
            
            # stage0对应关卡0-2, stage1对应3-5, 以此类推
            level_start = stage_index * 3
            level_end = min(level_start + 3, len(gen.CHUNK_SEQUENCES))
            
            for level_idx in range(level_start, level_end):
                level_dir = os.path.join(output_dir, f'stage{stage_num}_levels')
                gen.generate_level_map(level_idx, tile_size=8, output_dir=level_dir)
            
        except Exception as e:
            print(f"❌ 处理 {stage_file} 时出错: {e}")
            import traceback
            traceback.print_exc()
            continue
    
    print(f"\n{'=' * 60}")
    print(f"✅ 完成！所有地图已生成到目录: {output_dir}")
    print('=' * 60)


if __name__ == '__main__':
    main()
