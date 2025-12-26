# Runner626 (Phaser 复刻)

基于原版 Runner626 J2ME 游戏的 Phaser 3 复刻版。

## 约束

- 不使用原游戏素材；所有画面用**彩色几何图形**占位
- 不涉及音乐/音效
- Phaser 3 + TypeScript + Vite（规范工程结构）

## 本地运行

```bash
cd runner626_phaser
npm install
npm run dev
```

打开终端提示的地址（默认 `http://localhost:5173`）。

## 操作说明

| 操作 | 按键 |
|------|------|
| 蓄力跳跃 | **空格** (按住蓄力，松开跳) / 点击屏幕 |
| 滑铲 | **↓** 或 **S** (按住滑铲) |
| 暂停 | **Esc** |
| 重开 | **R** |

## 已实现功能

- [x] 自动前进的跑酷主循环
- [x] 单键蓄力跳跃（按住时间决定跳跃力度）
- [x] 滑铲/下蹲（可躲避低矮障碍）
- [x] 三种障碍类型（普通/高/宽）
- [x] 生命值系统（3 条命 + 短暂无敌）
- [x] 速度渐进（越跑越快，上限 450 px/s）
- [x] 视差背景
- [x] 暂停/重开

## 目录结构

```
runner626_phaser/
├── index.html
├── package.json
├── tsconfig.json
├── vite.config.ts
└── src/
    ├── main.ts              # 入口
    ├── game/
    │   ├── createGame.ts    # Phaser 初始化
    │   └── constants.ts     # 全局常量
    ├── scenes/
    │   ├── BootScene.ts     # 生成占位纹理
    │   └── MainScene.ts     # 游戏主场景
    └── entities/
        └── Player.ts        # 玩家类（状态机）
```

## 备注

`phaser_game/` 目录下是对**原游戏地图资源**做的小 demo（地图查看器 & 编辑器），与本复刻项目相互独立。
