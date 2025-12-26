import Phaser from 'phaser';
import { BootScene } from '../scenes/BootScene';
import { MainScene } from '../scenes/MainScene';

export function createGame(parent: HTMLElement | null): Phaser.Game {
  if (!parent) {
    throw new Error('Missing #app root element');
  }

  const config: Phaser.Types.Core.GameConfig = {
    type: Phaser.AUTO,
    parent,
    backgroundColor: '#0b0b0b',
    scale: {
      mode: Phaser.Scale.FIT,
      autoCenter: Phaser.Scale.CENTER_BOTH,
      width: 360,
      height: 640,
    },
    physics: {
      default: 'arcade',
      arcade: {
        gravity: { x: 0, y: 1400 },
        debug: false,
      },
    },
    scene: [BootScene, MainScene],
  };

  return new Phaser.Game(config);
}
