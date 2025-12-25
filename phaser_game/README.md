# Runner626 Phaser.js 地图系统

> 使用现代Web技术重构的地图渲染器和可视化编辑器

## 🎮 项目简介

这是Runner626地图系统的Phaser.js版本，提供：
- ✨ 实时地图渲染器
- ✏️ 可视化地图编辑器
- 📦 基于JSON的现代数据格式
- 🎨 完整的tile调色板
- 💾 导入/导出功能

## 📁 文件结构

```
phaser_game/
├── map_viewer.html        # 地图查看器 ⭐
├── map_editor.html        # 地图编辑器 ✏️
└── README.md              # 本文档

map_data/                   # JSON地图数据
├── level_config.json      # 关卡配置
├── stage0.json            # Stage 0数据
├── stage1.json            # Stage 1数据
├── stage2.json            # Stage 2数据
├── stage3.json            # Stage 3数据
└── stage4.json            # Stage 4数据
```

## 🚀 快速开始

### 1. 转换数据（如果还没做）

```bash
# 将二进制.bin文件转换为JSON
python convert_to_json.py
```

这会生成 `map_data/` 目录，包含所有地图数据的JSON版本。

### 2. 启动本地服务器

由于浏览器安全限制，需要通过HTTP服务器访问：

```bash
# 使用Python启动服务器
cd d:\pyworkspace\runner626
python -m http.server 8000

# 或使用Node.js
npx http-server -p 8000
```

### 3. 打开地图查看器

在浏览器中访问：
```
http://localhost:8000/phaser_game/map_viewer.html
```

### 4. 打开地图编辑器

在浏览器中访问：
```
http://localhost:8000/phaser_game/map_editor.html
```

## 🎨 地图查看器功能

### 特性
- 📊 查看所有16个关卡
- 🔍 缩放和平移
- 🎨 彩色地形渲染
- 👾 显示敌人、障碍物、收集品
- ⌨️ 键盘/鼠标控制

### 控制方式
- **关卡选择**: 使用下拉菜单切换关卡
- **鼠标拖拽**: 按住左键拖动视图
- **滚轮**: 缩放地图
- **缩放按钮**: 点击 🔍+ / 🔍- 按钮

### 地形颜色
| 颜色 | 地形类型 |
|------|----------|
| 🟤 棕色 | 普通地面 |
| 🟢 绿色 | 地面顶部（可站立） |
| ⚫ 灰色 | 金属平台 |
| 🟠 橙色 | 特殊平台 |
| 🔴 红色 | 尖刺/陷阱 |
| 🟡 金色 | 收集品位置 |
| 🔵 青色 | 水/液体 |

### 实体标记
- 🔴 红圆圈 + "E" = 敌人
- 🟣 紫色方块 = 障碍物
- 🟡 金色小圆 = 收集品

## ✏️ 地图编辑器功能

### 核心功能

#### 🎨 绘制工具
1. **🖌️ 绘制** - 放置选中的tile
2. **🧹 擦除** - 删除tile
3. **🪣 填充** - 区域填充
4. **💧 吸管** - 提取tile类型
5. **👾 敌人** - 放置敌人
6. **🚧 障碍** - 放置障碍物
7. **💰 收集品** - 放置收集品

#### 📦 Chunk管理
- 选择不同的Stage (0-4)
- 选择不同的Chunk (0-5)
- 新建空白chunk
- 复制现有chunk
- 清空当前chunk
- 删除chunk

#### 💾 文件操作
- **保存JSON** - 导出chunk为JSON文件
- **加载JSON** - 导入JSON文件
- **导出图片** - 保存为PNG图片
- **打开查看器** - 在查看器中预览

#### ⚡ 快捷键
| 快捷键 | 功能 |
|--------|------|
| 🖱️ 左键 | 绘制/放置 |
| 🖱️ 右键 | 擦除 |
| 🖱️ 中键拖拽 | 移动视图 |
| 🎡 滚轮 | 缩放 |
| Ctrl+Z | 撤销 |
| Ctrl+Y | 重做 |
| Ctrl+S | 保存 |
| 空格 | 切换网格 |

### 使用流程

#### 创建新地图
1. 点击 "➕ 新建" 创建空白chunk
2. 从右侧tile调色板选择地形类型
3. 使用 "🖌️ 绘制" 工具绘制地形
4. 切换到 "👾 敌人" 工具放置敌人
5. 点击 "💾 保存JSON" 导出

#### 编辑现有地图
1. 选择Stage和Chunk
2. 使用各种工具编辑
3. 使用Ctrl+Z撤销错误操作
4. 保存修改

#### 高级技巧
- **快速填充**: 使用 "🪣 填充" 工具快速填充大片区域
- **复制块**: 复制chunk后可以作为模板使用
- **网格对齐**: 开启网格帮助精确放置
- **吸管工具**: 快速切换到已有tile类型

## 📊 数据格式

### JSON结构

#### stage.json格式
```json
{
  "metadata": {
    "stage": "stage0",
    "chunkCount": 6,
    "chunkWidth": 100,
    "chunkHeight": 30,
    "tileSize": 8
  },
  "chunks": [
    {
      "id": 0,
      "terrain": [[0, 1, 2, ...], ...],
      "enemies": [
        {"type": 0, "x": 10, "y": 15}
      ],
      "obstacles": [
        {"type": 0, "x": 20, "y": 10}
      ],
      "collectibles": [
        {"type": 0, "x": 30, "y": 5}
      ]
    }
  ]
}
```

#### level_config.json格式
```json
{
  "chunkSequences": [
    [0, 1, 3, 2, 4, 5],  // Level 0的块序列
    [4, 3, 2, 0, 1, 5],  // Level 1的块序列
    ...
  ],
  "stageLevelMapping": {
    "stage0": [0, 1, 2],
    "stage1": [3, 4, 5],
    ...
  }
}
```

### Tile值参考

常用tile类型：
```javascript
0   - 空气（透明）
1   - 普通地面
7   - 金属平台
21  - 尖刺
23  - 可站立平台
28  - 地面顶部
35  - 陷阱
48  - 尖刺陷阱
62  - 水
68  - 金币位置
82  - 障碍物
89  - 可破坏箱子
```

## 🔧 技术栈

- **Phaser 3.70.0** - 游戏引擎
- **原生JavaScript** - 无需构建工具
- **JSON** - 数据格式
- **HTML5 Canvas** - 渲染

## 🎯 与原版的改进

### 数据格式
| 原版 | 新版 |
|------|------|
| 二进制.bin | JSON |
| 难以编辑 | 可读可编辑 |
| 需要工具解析 | 直接打开 |

### 工作流程
| 原版 | 新版 |
|------|------|
| 修改代码重新编译 | 可视化编辑 |
| 无预览 | 实时预览 |
| 手动计算坐标 | 鼠标点击 |

### 开发体验
- ✅ 所见即所得
- ✅ 实时预览
- ✅ 撤销/重做
- ✅ 导入/导出
- ✅ 版本控制友好

## 🐛 故障排除

### 问题：地图不显示
```
解决：检查浏览器控制台，确保通过HTTP服务器访问
不能直接用 file:// 协议打开
```

### 问题：JSON文件加载失败
```
解决：确保 map_data/ 目录存在且包含JSON文件
运行 python convert_to_json.py 生成数据
```

### 问题：编辑器卡顿
```
解决：降低缩放级别，或分块编辑
100x30的chunk对性能要求较高
```

### 问题：保存的JSON无法在查看器中使用
```
解决：确保JSON格式正确，包含所有必需字段
参考上面的数据格式说明
```

## 📝 开发说明

### 自定义Tile
在 `TILE_COLORS` 对象中添加新的tile类型：
```javascript
const TILE_COLORS = {
    // ...现有类型
    100: { color: 0xFF00FF, name: '新类型', alpha: 1 }
};
```

### 修改Chunk尺寸
修改 `EditorScene` 类中的参数：
```javascript
this.gridSize = 100;    // 宽度
this.gridHeight = 30;   // 高度
this.tileSize = 16;     // tile大小（像素）
```

### 添加新工具
在 `handlePaint()` 方法中添加新的工具逻辑：
```javascript
else if (this.currentTool === 'mytool') {
    // 自定义工具逻辑
}
```

## 🎓 学习资源

- [Phaser 3 文档](https://photonstorm.github.io/phaser3-docs/)
- [Phaser 示例](https://phaser.io/examples)
- [Tile地图教程](https://phaser.io/tutorials/making-your-first-phaser-3-game)

## 🔄 工作流程示例

### 创建新关卡
1. 打开编辑器
2. 为每个chunk (0-5) 设计地形
3. 导出所有chunk的JSON
4. 更新 `level_config.json` 添加新的块序列
5. 在查看器中预览新关卡

### 修改现有关卡
1. 在查看器中找到要修改的关卡
2. 确定使用的是哪个stage的哪个chunk
3. 在编辑器中加载该chunk
4. 进行修改
5. 保存并预览

### 批量编辑
1. 使用Python脚本批量修改JSON
2. 或在编辑器中使用填充工具
3. 保存后在查看器验证

## 📈 性能优化建议

1. **减少绘制调用** - 合并相同类型的tile
2. **使用图层** - 分离静态和动态元素
3. **延迟渲染** - 只渲染可见区域
4. **缓存图形** - 重用渲染结果

## 🤝 贡献

欢迎提交：
- 🐛 Bug报告
- 💡 新功能建议
- 🎨 改进UI/UX
- 📚 完善文档

## 📄 许可

本项目仅用于学习和研究目的。

## 🎉 下一步

- [ ] 添加动画预览
- [ ] 多人协作编辑
- [ ] 导出到游戏引擎
- [ ] 地形生成算法
- [ ] 自动寻路预览
- [ ] 碰撞检测可视化

---

**享受创作！** 🎮✨

如有问题，请查看浏览器控制台的错误信息。
