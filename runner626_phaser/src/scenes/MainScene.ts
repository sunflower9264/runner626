import Phaser from 'phaser';
import { Player } from '../entities/Player';
import { CONTROL_HINT, WORLD } from '../game/constants';
import { MapManager } from '../game/MapManager';
import { MapElement } from '../entities/MapElements';

type RunState = 'running' | 'paused' | 'gameover';

export class MainScene extends Phaser.Scene {
  private player!: Player;
  private mapManager!: MapManager;

  private runState: RunState = 'running';
  private baseSpeed = 220;
  private speedPxPerSec = 220;
  private distance = 0;
  private lives = 3;
  private invincibleUntil = 0;

  private actionKey!: Phaser.Input.Keyboard.Key;
  private slideKey!: Phaser.Input.Keyboard.Key;
  private restartKey!: Phaser.Input.Keyboard.Key;
  private pauseKey!: Phaser.Input.Keyboard.Key;

  private scoreText!: Phaser.GameObjects.Text;
  private livesText!: Phaser.GameObjects.Text;
  private hintText!: Phaser.GameObjects.Text;
  private overlayText!: Phaser.GameObjects.Text;

  // Parallax background layers


  constructor() {
    super('main');
  }

  create(): void {
    this.physics.world.setBounds(0, 0, WORLD.width, WORLD.height);

    this.createBackground();

    this.mapManager = new MapManager(this);
    this.mapManager.loadLevel(0); // Load level 0 by default

    this.createPlayer();
    this.createUI();
    this.createControls();

    // Collisions
    this.physics.add.collider(this.player.displayObject, this.mapManager.getGroundGroup());

    this.physics.add.overlap(
      this.player.displayObject,
      this.mapManager.getElementsGroup(),
      (player, obj) => this.onMapElementOverlap(player, obj),
      undefined,
      this
    );

    this.runState = 'running';
    this.lives = 3;
    this.invincibleUntil = 0;
    this.distance = 0;
    this.speedPxPerSec = this.baseSpeed;
  }

  update(time: number, deltaMs: number): void {
    if (this.runState === 'paused') return;

    if (this.runState === 'running') {
      this.tickRunner(time, deltaMs);
    }

    this.player.update(deltaMs);
    this.updateUI();

  }

  private onMapElementOverlap(playerGO: Phaser.GameObjects.GameObject, elementGO: Phaser.GameObjects.GameObject) {
    const element = elementGO.getData('element') as MapElement;
    if (element) {
      element.onOverlap(this.player);
    }
  }

  private createBackground(): void {
    this.cameras.main.setBackgroundColor('#1e1e2e');
  }



  private createPlayer(): void {
    this.player = new Player(this, 80, WORLD.groundY);
  }

  private createUI(): void {
    const style: Phaser.Types.GameObjects.Text.TextStyle = {
      fontFamily: 'system-ui, -apple-system, Segoe UI, sans-serif',
      fontSize: '16px',
      color: '#ffffff',
    };

    this.scoreText = this.add.text(12, 12, '距离: 0', style).setDepth(10).setScrollFactor(0);
    this.livesText = this.add.text(12, 34, '❤️ 3', { ...style, fontSize: '18px' }).setDepth(10).setScrollFactor(0);
    this.hintText = this.add
      .text(12, 58, CONTROL_HINT, { ...style, fontSize: '13px', color: '#aaaaaa' })
      .setDepth(10).setScrollFactor(0);

    this.overlayText = this.add
      .text(WORLD.width / 2, WORLD.height / 2, '', {
        ...style,
        fontSize: '26px',
        align: 'center',
      })
      .setOrigin(0.5, 0.5)
      .setDepth(20)
      .setVisible(false)
      .setScrollFactor(0);
  }

  private createControls(): void {
    const kb = this.input.keyboard;
    if (!kb) throw new Error('Keyboard input not available');

    this.actionKey = kb.addKey(Phaser.Input.Keyboard.KeyCodes.SPACE);
    this.slideKey = kb.addKey(Phaser.Input.Keyboard.KeyCodes.DOWN);
    this.restartKey = kb.addKey(Phaser.Input.Keyboard.KeyCodes.R);
    this.pauseKey = kb.addKey(Phaser.Input.Keyboard.KeyCodes.ESC);

    // Also add S as slide alternative
    kb.addKey(Phaser.Input.Keyboard.KeyCodes.S).on('down', () => {
      if (this.runState === 'running') this.player.startSlide();
    });
    kb.addKey(Phaser.Input.Keyboard.KeyCodes.S).on('up', () => {
      this.player.stopSlide();
    });

    // Also support pointer as the single action button
    this.input.on('pointerdown', () => {
      if (this.runState !== 'running') return;
      this.player.startJump(this.speedPxPerSec);
    });
    this.input.on('pointerup', () => {
      if (this.runState !== 'running') return;
      this.player.stopJump();
    });
  }

  private tickRunner(time: number, deltaMs: number): void {
    // Action key: hold -> charge, release -> jump
    if (Phaser.Input.Keyboard.JustDown(this.actionKey)) {
      this.player.startJump(this.speedPxPerSec);
    }
    if (Phaser.Input.Keyboard.JustUp(this.actionKey)) {
      this.player.stopJump();
    }

    // Slide key (DOWN arrow)
    if (this.slideKey.isDown) {
      this.player.startSlide();
    } else if (this.slideKey.isUp && this.player.isSliding) {
      this.player.stopSlide();
    }

    // Pause
    if (Phaser.Input.Keyboard.JustDown(this.pauseKey)) {
      this.togglePause();
      if (this.runState === 'paused') {
        this.overlayText.setText('已暂停');
        this.overlayText.setVisible(true);
      } else if (this.runState === 'running') {
        this.overlayText.setVisible(false);
      }
    }
  }

  private togglePause(): void {
    if (this.runState === 'gameover') return;

    if (this.runState === 'paused') {
      this.runState = 'running';
      return;
    }

    this.runState = 'paused';
  }

  private updateUI(): void {
    if (this.scoreText) {
      this.scoreText.setText(`距离: ${Math.floor(this.distance)}`);
    }

    if (this.livesText) {
      this.livesText.setText(`❤️ ${this.lives}`);
    }

    if (this.overlayText) {
      if (this.runState === 'gameover') {
        this.overlayText.setText('游戏结束\n按 R 重开');
        this.overlayText.setVisible(true);
      }
    }
  }
}
