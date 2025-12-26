import Phaser from 'phaser';

export type PlayerState = 'running' | 'charging' | 'airborne' | 'sliding' | 'dead';

export class Player {
  private readonly sprite: Phaser.Physics.Arcade.Sprite;
  private state: PlayerState = 'running';
  private chargeMs = 0;

  // Store original body dimensions
  private readonly normalBodyH = 44;
  private readonly slideBodyH = 22;

  constructor(scene: Phaser.Scene, x: number, y: number) {
    this.sprite = scene.physics.add
      .sprite(x, y, 'player')
      .setOrigin(0.5, 1)
      .setCollideWorldBounds(false);

    // Slightly forgiving body
    const body = this.sprite.body as Phaser.Physics.Arcade.Body;
    body.setSize(22, this.normalBodyH);
    body.setOffset(5, 4);
  }

  get body(): Phaser.Physics.Arcade.Body {
    return this.sprite.body as Phaser.Physics.Arcade.Body;
  }

  get displayObject(): Phaser.Physics.Arcade.Sprite {
    return this.sprite;
  }

  get isDead(): boolean {
    return this.state === 'dead';
  }

  get isSliding(): boolean {
    return this.state === 'sliding';
  }

  update(deltaMs: number): void {
    if (this.state === 'dead') return;

    const onGround = this.body.blocked.down || this.body.touching.down;
    if (onGround && this.state === 'airborne') {
      this.state = 'running';
      this.chargeMs = 0;
    }

    if (this.state === 'charging') {
      this.chargeMs = Math.min(this.chargeMs + deltaMs, 550);
      // Visual feedback: squash a bit
      const t = this.chargeMs / 550;
      this.sprite.setScale(1.0 + 0.08 * t, 1.0 - 0.08 * t);
    } else if (this.state === 'sliding') {
      // Flatten sprite
      this.sprite.setScale(1.2, 0.5);
    } else {
      this.sprite.setScale(1, 1);
    }
  }

  tryStartCharge(): void {
    if (this.state === 'dead' || this.state === 'sliding') return;

    const onGround = this.body.blocked.down || this.body.touching.down;
    if (!onGround) return;

    this.state = 'charging';
    this.chargeMs = 0;
  }

  tryReleaseJump(): void {
    if (this.state !== 'charging') return;

    // Variable jump based on hold time (single-button feel)
    const t = Phaser.Math.Clamp(this.chargeMs / 550, 0, 1);
    const jumpVelocity = -520 - 380 * t;

    this.body.setVelocityY(jumpVelocity);
    this.state = 'airborne';
  }

  /** Start sliding (duck) - shrink hitbox */
  startSlide(): void {
    if (this.state === 'dead' || this.state === 'airborne' || this.state === 'charging') return;
    if (this.state === 'sliding') return;

    this.state = 'sliding';
    this.body.setSize(22, this.slideBodyH);
    this.body.setOffset(5, 4 + (this.normalBodyH - this.slideBodyH));
  }

  /** Stop sliding - restore hitbox */
  stopSlide(): void {
    if (this.state !== 'sliding') return;
    this.state = 'running';
    this.body.setSize(22, this.normalBodyH);
    this.body.setOffset(5, 4);
  }

  die(): void {
    if (this.state === 'dead') return;
    this.state = 'dead';
    this.body.setVelocity(0, 0);
    this.sprite.setTint(0x666666);
  }

  /** Trigger a short visual flash indicating damage taken */
  flash(): void {
    this.sprite.setTint(0xff6666);
    this.sprite.scene.time.delayedCall(120, () => {
      if (this.state !== 'dead') {
        this.sprite.clearTint();
      }
    });
  }
}
