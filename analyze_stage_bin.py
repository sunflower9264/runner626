"""
调试脚本：检查stage.bin文件的实际结构
"""
import struct
import os

def analyze_bin_file(filepath):
    """分析bin文件结构"""
    print(f"\n{'='*60}")
    print(f"分析文件: {filepath}")
    print('='*60)
    
    file_size = os.path.getsize(filepath)
    print(f"文件大小: {file_size} bytes")
    
    with open(filepath, 'rb') as f:
        # 读取块数量和维度
        num_chunks = struct.unpack('>i', f.read(4))[0]
        chunk_width = struct.unpack('>i', f.read(4))[0]
        chunk_height = struct.unpack('>i', f.read(4))[0]
        
        print(f"\n块数量: {num_chunks}")
        print(f"块宽度: {chunk_width} tiles")
        print(f"块高度: {chunk_height} tiles")
        print(f"每块大小: {chunk_width * chunk_height} bytes")
        
        expected_map_size = num_chunks * chunk_width * chunk_height
        print(f"预期地图数据大小: {expected_map_size} bytes")
        
        # 跳过地图数据
        f.seek(12 + expected_map_size)
        pos_after_map = f.tell()
        print(f"地图数据后的位置: {pos_after_map}")
        
        remaining = file_size - pos_after_map
        print(f"剩余字节: {remaining}")
        
        # 尝试读取后续数据
        if remaining > 0:
            print(f"\n读取剩余数据的前100字节:")
            f.seek(pos_after_map)
            data = f.read(min(100, remaining))
            print(f"Hex: {data.hex()}")
            
            # 尝试解析为整数
            f.seek(pos_after_map)
            if remaining >= 4:
                try:
                    val = struct.unpack('>i', f.read(4))[0]
                    print(f"\n第一个int值: {val}")
                    
                    if val == 0:
                        print("  -> 敌人数量为0，可能没有敌人数据")
                    elif val < 0 or val > 1000:
                        print("  -> 值异常，可能不是敌人数量")
                    else:
                        print(f"  -> 可能是第一个块的敌人数量: {val}")
                except:
                    print("  -> 无法解析为int")
            
            # 检查是否整个剩余部分都是0
            f.seek(pos_after_map)
            remaining_data = f.read()
            if all(b == 0 for b in remaining_data):
                print(f"\n⚠️  剩余 {len(remaining_data)} 字节全部为0")
            else:
                non_zero = sum(1 for b in remaining_data if b != 0)
                print(f"\n剩余数据中有 {non_zero} 个非零字节")

if __name__ == '__main__':
    resources_dir = 'resources'
    
    for i in range(5):
        filepath = os.path.join(resources_dir, f'stage{i}.bin')
        if os.path.exists(filepath):
            analyze_bin_file(filepath)
