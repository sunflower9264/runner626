import Phaser from 'phaser';

export type PlayerState = 'running' | 'airborne' | 'sliding' | 'dead';

export class Player {
  private readonly sprite: Phaser.Physics.Arcade.Sprite;
  private state: PlayerState = 'running';
  private jumpTimer = 0;
  private isJumping = false;
  private readonly maxJumpTime = 350; // ms
  public speedMultiplier = 1;

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

  get x(): number {
    return this.sprite.x;
  }

  set x(value: number) {
    this.sprite.x = value;
  }

  get isDead(): boolean {
    return this.state === 'dead';
  }

  get isSliding(): boolean {
    return this.state === 'sliding';
  }

  update(deltaMs: number): void {
    // Reset speed multiplier every frame (will be set by SpeedStrip if overlapping)
    this.speedMultiplier = 1;

    if (this.state === 'dead') return;

    const onGround = this.body.blocked.down || this.body.touching.down;

    if (onGround) {
      this.isJumping = false;
      if (this.state === 'airborne') {
        this.state = 'running';
      }
    }

    // Variable jump height logic
    if (this.isJumping) {
      this.jumpTimer += deltaMs;
      if (this.jumpTimer < this.maxJumpTime) {
        // Apply upward force (gravity compensation) while holding jump
        // This makes the jump higher the longer you hold
        this.body.velocity.y -= 15 * (deltaMs / 16);
      } else {
        this.isJumping = false;
      }
    }

    if (this.state === 'sliding') {
      // Flatten sprite
      this.sprite.setScale(1.2, 0.5);
    } else {
      this.sprite.setScale(1, 1);
    }
  }

  startJump(currentSpeed: number): void {
    if (this.state === 'dead' || this.state === 'sliding') return;

    const onGround = this.body.blocked.down || this.body.touching.down;
    if (!onGround) return;

    this.state = 'airborne';
    this.isJumping = true;
    this.jumpTimer = 0;

    // Base jump velocity
    let jumpVelocity = -400;

    // Speed bonus: faster speed = higher jump
    // Assuming speed ranges from ~200 to ~450
    const speedBonus = (currentSpeed - 200) * 0.6;
    jumpVelocity -= Math.max(0, speedBonus);

    this.body.setVelocityY(jumpVelocity);
  }

  stopJump(): void {
    this.isJumping = false;
  }

  /** Start sliding (duck) - shrink hitbox */
  startSlide(): void {
    if (this.state === 'dead' || this.state === 'airborne') return;
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
