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
  }
}
