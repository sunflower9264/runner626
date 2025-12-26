import Phaser from 'phaser';

export class BootScene extends Phaser.Scene {
  constructor() {
    super('boot');
  }

  create(): void {
    this.createPlaceholderTextures();
    this.scene.start('main');
  }

  private createPlaceholderTextures(): void {
    const g = this.add.graphics();

    // Player: cyan rounded rect
    g.clear();
    g.fillStyle(0x00d4ff, 1);
    g.fillRoundedRect(0, 0, 32, 48, 6);
    g.generateTexture('player', 32, 48);

    // Obstacle small: magenta rect
    g.clear();
    g.fillStyle(0xff3aa7, 1);
    g.fillRect(0, 0, 28, 44);
    g.generateTexture('obstacle', 28, 44);

    // Obstacle tall: orange rect
    g.clear();
    g.fillStyle(0xff8800, 1);
    g.fillRect(0, 0, 24, 72);
    g.generateTexture('obstacle_tall', 24, 72);

    // Obstacle wide (low): yellow rect (duck/slide)
    g.clear();
    g.fillStyle(0xffdd00, 1);
    g.fillRect(0, 0, 60, 28);
    g.generateTexture('obstacle_wide', 60, 28);

    // Ground tile: green strip
    g.clear();
    g.fillStyle(0x22cc55, 1);
    g.fillRect(0, 0, 64, 16);
    g.generateTexture('ground', 64, 16);

    // Background layers (parallax)
    g.clear();
    g.fillStyle(0x1a1a2e, 1);
    g.fillRect(0, 0, 360, 640);
    g.generateTexture('bg_far', 360, 640);

    g.clear();
    g.fillStyle(0x16213e, 0.6);
    g.fillRect(0, 0, 120, 200);
    g.generateTexture('bg_building', 120, 200);

    // Heart icon for lives
    g.clear();
    g.fillStyle(0xff4466, 1);
    g.fillCircle(6, 8, 6);
    g.fillCircle(18, 8, 6);
    g.fillTriangle(0, 10, 24, 10, 12, 24);
    g.generateTexture('heart', 24, 24);

    // UI chip
    g.clear();
    g.fillStyle(0xffffff, 1);
    g.fillRoundedRect(0, 0, 10, 10, 3);
    g.generateTexture('chip', 10, 10);

    g.destroy();

    // Map Elements
    const g2 = this.add.graphics();

    // Ground Tile (8x8)
    g2.fillStyle(0x8b4513, 1); // Brown
    g2.fillRect(0, 0, 8, 8);
    g2.generateTexture('ground_tile', 8, 8);

    // Trap (Spike)
    g2.clear();
    g2.fillStyle(0xff0000, 1);
    g2.beginPath();
    g2.moveTo(0, 8);
    g2.lineTo(4, 0);
    g2.lineTo(8, 8);
    g2.closePath();
    g2.fillPath();
    g2.generateTexture('trap', 8, 8);

    // Bounce Ball
    g2.clear();
    g2.fillStyle(0x00ff00, 1);
    g2.fillCircle(4, 4, 4);
    g2.generateTexture('bounce_ball', 8, 8);

    // Speed Strip (Fast)
    g2.clear();
    g2.fillStyle(0xffff00, 0.8);
    g2.fillRect(0, 0, 8, 8);
    g2.generateTexture('speed_strip', 8, 8);

    // Speed Strip (Slow)
    g2.clear();
    g2.fillStyle(0x0000ff, 0.8);
    g2.fillRect(0, 0, 8, 8);
    g2.generateTexture('slow_strip', 8, 8);

    // Gate
    g2.clear();
    g2.fillStyle(0x555555, 1);
    g2.fillRect(0, 0, 8, 24); // Tall gate
    g2.generateTexture('gate', 8, 24);

    // Switch
    g2.clear();
    g2.fillStyle(0xff00ff, 1);
    g2.fillRect(0, 0, 8, 8);
    g2.generateTexture('switch', 8, 8);

    g2.destroy();
  }
}
