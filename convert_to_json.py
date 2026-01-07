"""
将stage.bin文件转换为现代JSON格式
便于编辑和使用
"""

import struct
import json
import os
import numpy as np


def convert_stage_to_json(stage_file, resources_dir='resources'):
    """将stage.bin转换为JSON
    
    根据c.java中a(String str)方法的读取逻辑:
    - f79v = chunkWidth (第二个int读取的值)
    - f80w = chunkHeight (第三个int读取的值)
    - f86a = new byte[numChunks][width][height]
    - 读取顺序: 外循环y(height), 内循环x(width)
    - 存储方式: f86a[chunk][x][y] = byte
    
    所以文件中数据是按行(y)读取，但存储到[x][y]
    我们按相同方式读取后，输出为[y][x]的二维数组便于可视化
    """
    filepath = os.path.join(resources_dir, stage_file)
    
    print(f"转换: {stage_file}")
    
    with open(filepath, 'rb') as f:
        # 读取基本信息
        num_chunks = struct.unpack('>i', f.read(4))[0]
        chunk_width = struct.unpack('>i', f.read(4))[0]   # f79v - X方向的格子数
        chunk_height = struct.unpack('>i', f.read(4))[0]  # f80w - Y方向的格子数
        
        print(f"  块数量: {num_chunks}, 宽度: {chunk_width}, 高度: {chunk_height}")
        
        # 读取地形块数据
        # Java代码中: 外循环i4遍历height(y), 内循环i5遍历width(x)
        # 存储为 f86a[chunk][x][y]
        # 我们按相同顺序读取，然后转换为[y][x]格式输出
        chunks = []
        for chunk_idx in range(num_chunks):
            # 初始化一个[width][height]的临时数组，模拟Java的存储方式
            temp_chunk = [[0 for _ in range(chunk_height)] for _ in range(chunk_width)]
            
            # 按Java代码的读取顺序: 外层y, 内层x
            for y in range(chunk_height):
                for x in range(chunk_width):
                    tile_value = struct.unpack('b', f.read(1))[0]
                    if tile_value < 0:
                        tile_value += 256
                    temp_chunk[x][y] = tile_value  # 存储到[x][y]
            
            # 转换为[y][x]格式，便于显示 (行优先)
            chunk = []
            for y in range(chunk_height):
                row = []
                for x in range(chunk_width):
                    row.append(temp_chunk[x][y])
                chunk.append(row)
            chunks.append(chunk)
        
        # 读取敌人数据
        enemy_counts = []
        for i in range(num_chunks):
            count = struct.unpack('>i', f.read(4))[0]
            enemy_counts.append(count)
        
        enemies = []
        for i in range(num_chunks):
            chunk_enemies = []
            for j in range(enemy_counts[i]):
                enemy_type = struct.unpack('b', f.read(1))[0]
                enemy_x = struct.unpack('b', f.read(1))[0]
                enemy_y = struct.unpack('b', f.read(1))[0]
                chunk_enemies.append({
                    "type": enemy_type,
                    "x": enemy_x,
                    "y": enemy_y
                })
            enemies.append(chunk_enemies)
        
        # 读取障碍物数据
        obstacle_counts = []
        for i in range(num_chunks):
            count = struct.unpack('>i', f.read(4))[0]
            obstacle_counts.append(count)
        
        obstacles = []
        for i in range(num_chunks):
            chunk_obstacles = []
            for j in range(obstacle_counts[i]):
                obs_type = struct.unpack('b', f.read(1))[0]
                obs_x = struct.unpack('b', f.read(1))[0]
                obs_y = struct.unpack('b', f.read(1))[0]
                chunk_obstacles.append({
                    "type": obs_type,
                    "x": obs_x,
                    "y": obs_y
                })
            obstacles.append(chunk_obstacles)
        
        # 读取收集品数据
        collectible_counts = []
        for i in range(num_chunks):
            count = struct.unpack('>i', f.read(4))[0]
            collectible_counts.append(count)
        
        collectibles = []
        for i in range(num_chunks):
            chunk_collectibles = []
            for j in range(collectible_counts[i]):
                col_type = struct.unpack('b', f.read(1))[0]
                col_x = struct.unpack('b', f.read(1))[0]
                col_y = struct.unpack('b', f.read(1))[0]
                chunk_collectibles.append({
                    "type": col_type,
                    "x": col_x,
                    "y": col_y
                })
            collectibles.append(chunk_collectibles)
    
    # 构建JSON结构
    data = {
        "metadata": {
            "stage": stage_file.replace('.bin', ''),
            "chunkCount": num_chunks,
            "chunkWidth": chunk_width,
            "chunkHeight": chunk_height,
            "tileSize": 8
        },
        "chunks": []
    }
    
    for i in range(num_chunks):
        chunk_data = {
            "id": i,
            "terrain": chunks[i],
            "enemies": enemies[i],
            "obstacles": obstacles[i],
            "collectibles": collectibles[i]
        }
        data["chunks"].append(chunk_data)
    
    return data


def convert_all_stages():
    """转换所有stage文件"""
    resources_dir = 'source/resources'
    output_dir = 'map_data'
    os.makedirs(output_dir, exist_ok=True)
    
    # 块序列定义
    chunk_sequences = [
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
    
    # 保存块序列配置
    level_config = {
        "chunkSequences": chunk_sequences,
        "stageLevelMapping": {
            "stage0": [0, 1, 2],
            "stage1": [3, 4, 5],
            "stage2": [6, 7, 8],
            "stage3": [9, 10, 11],
            "stage4": [12, 13, 14, 15]
        }
    }
    
    with open(os.path.join(output_dir, 'level_config.json'), 'w', encoding='utf-8') as f:
        json.dump(level_config, f, indent=2)
    print(f"✅ 保存关卡配置: level_config.json")
    
    # 转换每个stage
    for i in range(5):
        stage_file = f'stage{i}.bin'
        stage_path = os.path.join(resources_dir, stage_file)
        
        if not os.path.exists(stage_path):
            print(f"⚠️  跳过: {stage_file}")
            continue
        
        data = convert_stage_to_json(stage_file, resources_dir)
        
        output_path = os.path.join(output_dir, f'stage{i}.json')
        with open(output_path, 'w', encoding='utf-8') as f:
            json.dump(data, f, indent=2)
        
        print(f"✅ 保存: {output_path} ({len(json.dumps(data))} bytes)")
    
    print(f"\n🎉 转换完成！所有数据保存到: {output_dir}/")


if __name__ == '__main__':
    print("="*60)
    print("🔄 Stage数据转换器 - Binary to JSON")
    print("="*60)
    convert_all_stages()
