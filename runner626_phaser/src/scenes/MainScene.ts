import Phaser from 'phaser';
import { Player } from '../entities/Player';
import { CONTROL_HINT, WORLD } from '../game/constants';

type RunState = 'running' | 'paused' | 'gameover';
type ObstacleType = 'normal' | 'tall' | 'wide';

export class MainScene extends Phaser.Scene {
  private player!: Player;
  private ground!: Phaser.Physics.Arcade.StaticGroup;
  private obstacles!: Phaser.Physics.Arcade.Group;

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

  private spawnTimer = 0;

  // Parallax background layers
  private bgBuildings: Phaser.GameObjects.Image[] = [];

  constructor() {
    super('main');
  }

  create(): void {
    this.physics.world.setBounds(0, 0, WORLD.width, WORLD.height);

    this.createBackground();
    this.createGround();
    this.createPlayer();
    this.createObstacles();
    this.createUI();
    this.createControls();

    this.runState = 'running';
    this.lives = 3;
    this.invincibleUntil = 0;
    this.distance = 0;
    this.speedPxPerSec = this.baseSpeed;
    this.spawnTimer = 0;
  }

  update(time: number, deltaMs: number): void {
    if (this.runState === 'paused') return;

    if (this.runState === 'running') {
      this.tickRunner(time, deltaMs);
    }

    this.player.update(deltaMs);
    this.updateUI();
    this.updateParallax(deltaMs);
  }

  private createBackground(): void {
    this.add.image(0, 0, 'bg_far').setOrigin(0, 0).setDepth(-10);

    // 3 building silhouettes for parallax
    for (let i = 0; i < 4; i++) {
      const b = this.add
        .image(i * 130, WORLD.groundY, 'bg_building')
        .setOrigin(0, 1)
        .setDepth(-5)
        .setAlpha(0.5 + Math.random() * 0.3)
        .setScale(0.8 + Math.random() * 0.5, 0.6 + Math.random() * 0.6);
      this.bgBuildings.push(b);
    }
  }

  private updateParallax(deltaMs: number): void {
    const parallaxSpeed = this.speedPxPerSec * 0.25 * (deltaMs / 1000);
    for (const b of this.bgBuildings) {
      b.x -= parallaxSpeed;
      if (b.x < -140) {
        b.x += 4 * 130 + 50;
        b.setScale(0.8 + Math.random() * 0.5, 0.6 + Math.random() * 0.6);
      }
    }
  }

  private createGround(): void {
    this.ground = this.physics.add.staticGroup();

    // Tile ground across width
    const tileW = 64;
    for (let x = 0; x <= WORLD.width + tileW; x += tileW) {
      const tile = this.ground.create(x, WORLD.groundY, 'ground');
      tile.setOrigin(0, 0);
      tile.refreshBody();
    }
  }

  private createPlayer(): void {
    this.player = new Player(this, 80, WORLD.groundY);
    this.physics.add.collider(this.player.displayObject, this.ground);
  }

  private createObstacles(): void {
    this.obstacles = this.physics.add.group({
      immovable: true,
      allowGravity: false,
    });

    this.physics.add.overlap(
      this.player.displayObject,
      this.obstacles,
      () => this.onHitObstacle(),
      undefined,
      this
    );
  }

  private onHitObstacle(): void {
    if (this.runState !== 'running') return;
    const now = this.time.now;
    if (now < this.invincibleUntil) return;

    this.lives--;
    if (this.lives <= 0) {
      this.player.die();
      this.runState = 'gameover';
      this.overlayText.setText('游戏结束\n按 R 重开');
      this.overlayText.setVisible(true);
    } else {
      // Short invincibility
      this.invincibleUntil = now + 1500;
      this.player.flash();
    }
  }

  private createUI(): void {
    const style: Phaser.Types.GameObjects.Text.TextStyle = {
      fontFamily: 'system-ui, -apple-system, Segoe UI, sans-serif',
      fontSize: '16px',
      color: '#ffffff',
    };

    this.scoreText = this.add.text(12, 12, '距离: 0', style).setDepth(10);
    this.livesText = this.add.text(12, 34, '❤️ 3', { ...style, fontSize: '18px' }).setDepth(10);
    this.hintText = this.add
      .text(12, 58, CONTROL_HINT, { ...style, fontSize: '13px', color: '#aaaaaa' })
      .setDepth(10);

    this.overlayText = this.add
      .text(WORLD.width / 2, WORLD.height / 2, '', {
        ...style,
        fontSize: '26px',
        align: 'center',
      })
      .setOrigin(0.5, 0.5)
      .setDepth(20)
      .setVisible(false);
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
      this.player.tryStartCharge();
    });
    this.input.on('pointerup', () => {
      if (this.runState !== 'running') return;
      this.player.tryReleaseJump();
    });
  }

  private tickRunner(time: number, deltaMs: number): void {
    // Action key: hold -> charge, release -> jump
    if (Phaser.Input.Keyboard.JustDown(this.actionKey)) {
      this.player.tryStartCharge();
    }
    if (Phaser.Input.Keyboard.JustUp(this.actionKey)) {
      this.player.tryReleaseJump();
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
    }

    // Restart
    if (Phaser.Input.Keyboard.JustDown(this.restartKey)) {
      this.scene.restart();
      return;
    }

    // World scroll + score
    const deltaSec = deltaMs / 1000;
    this.distance += this.speedPxPerSec * deltaSec;

    // Gradually increase speed (cap at 450)
    this.speedPxPerSec = Math.min(this.baseSpeed + this.distance / 18, 450);

    // Spawn obstacles
    this.spawnTimer += deltaMs;
    const spawnInterval = Phaser.Math.Clamp(1000 - this.distance / 30, 480, 1000);
    if (this.spawnTimer >= spawnInterval) {
      this.spawnTimer = 0;
      this.spawnObstacle();
    }

    // Move obstacles left
    const dx = this.speedPxPerSec * deltaSec;
    this.obstacles.children.each((child) => {
      const obj = child as Phaser.Physics.Arcade.Image;
      obj.x -= dx;
      if (obj.x < -80) {
        obj.destroy();
      }
      return true;
    });

    // Flicker player if invincible
    if (time < this.invincibleUntil && Math.floor(time / 80) % 2 === 0) {
      this.player.displayObject.setAlpha(0.4);
    } else {
      this.player.displayObject.setAlpha(1);
    }
  }

  private spawnObstacle(): void {
    const x = WORLD.width + 40;
    const y = WORLD.groundY;

    // Randomly pick obstacle type
    const roll = Math.random();
    let obsType: ObstacleType;
    let textureKey: string;
    let bodyW: number;
    let bodyH: number;
    let originY = 1;

    if (roll < 0.55) {
      obsType = 'normal';
      textureKey = 'obstacle';
      bodyW = 24;
      bodyH = 40;
    } else if (roll < 0.8) {
      obsType = 'tall';
      textureKey = 'obstacle_tall';
      bodyW = 20;
      bodyH = 68;
    } else {
      obsType = 'wide';
      textureKey = 'obstacle_wide';
      bodyW = 56;
      bodyH = 24;
    }

    const obs = this.obstacles.create(x, y, textureKey) as Phaser.Physics.Arcade.Image;
    obs.setOrigin(0.5, originY);
    obs.setImmovable(true);
    const obsBody = obs.body as Phaser.Physics.Arcade.Body;
    obsBody.setSize(bodyW, bodyH);
    obsBody.setOffset((obs.width - bodyW) / 2, obs.height - bodyH);
  }

  private updateUI(): void {
    this.scoreText.setText(`距离: ${Math.floor(this.distance)}`);
    this.livesText.setText(`❤️ ${this.lives}`);

    if (this.runState === 'paused') {
      this.overlayText.setText('已暂停');
      this.overlayText.setVisible(true);
    } else if (this.runState === 'running') {
      this.overlayText.setVisible(false);
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
}
