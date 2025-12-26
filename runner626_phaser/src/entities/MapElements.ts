import Phaser from 'phaser';
import { Player } from './Player';

export abstract class MapElement {
    protected sprite: Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image;
    protected scene: Phaser.Scene;

    constructor(scene: Phaser.Scene, x: number, y: number, texture: string) {
        this.scene = scene;
        this.sprite = scene.physics.add.image(x, y, texture);
        this.sprite.setData('element', this);
        // Default to immovable/static
        (this.sprite.body as Phaser.Physics.Arcade.Body).setAllowGravity(false);
        (this.sprite.body as Phaser.Physics.Arcade.Body).setImmovable(true);
    }

    get displayObject() {
        return this.sprite;
    }

    abstract onOverlap(player: Player): void;
}

export class Trap extends MapElement {
    constructor(scene: Phaser.Scene, x: number, y: number) {
        super(scene, x, y, 'trap'); // Ensure 'trap' texture exists or use a placeholder
        this.sprite.setTint(0xff0000); // Red tint for danger
    }

    onOverlap(player: Player): void {
        player.die();
    }
}

export class BounceBall extends MapElement {
    constructor(scene: Phaser.Scene, x: number, y: number) {
        super(scene, x, y, 'bounce_ball'); // Ensure texture exists
        this.sprite.setTint(0x00ff00); // Green tint
    }

    onOverlap(player: Player): void {
        // Boost player jump
        // We can force a jump or give a massive vertical velocity
        const body = player.body;
        body.setVelocityY(-700); // Super jump
        player.startJump(0); // Reset state to airborne if needed
    }
}

export class SpeedStrip extends MapElement {
    private speedMultiplier: number;

    constructor(scene: Phaser.Scene, x: number, y: number, type: 'fast' | 'slow') {
        super(scene, x, y, type === 'fast' ? 'speed_strip' : 'slow_strip');
        this.speedMultiplier = type === 'fast' ? 1.5 : 0.5;
        this.sprite.setTint(type === 'fast' ? 0xffff00 : 0x0000ff);
    }

    onOverlap(player: Player): void {
        player.speedMultiplier = this.speedMultiplier;
    }

    get multiplier() {
        return this.speedMultiplier;
    }
}

export class Gate extends MapElement {
    private isOpen = false;

    constructor(scene: Phaser.Scene, x: number, y: number) {
        super(scene, x, y, 'gate');
        this.sprite.setTint(0x555555);
        // Gates are physical obstacles
        (this.sprite.body as Phaser.Physics.Arcade.Body).setImmovable(true);
    }

    onOverlap(player: Player): void {
        // If closed, it acts as a wall (handled by collider)
        // If open, it allows passing (disable body)
    }

    open(): void {
        if (this.isOpen) return;
        this.isOpen = true;
        this.sprite.setAlpha(0.3);
        (this.sprite.body as Phaser.Physics.Arcade.Body).checkCollision.none = true;
    }

    close(): void {
        if (!this.isOpen) return;
        this.isOpen = false;
        this.sprite.setAlpha(1);
        (this.sprite.body as Phaser.Physics.Arcade.Body).checkCollision.none = false;
    }
}

export class Switch extends MapElement {
    private linkedGate: Gate | null = null;

    constructor(scene: Phaser.Scene, x: number, y: number) {
        super(scene, x, y, 'switch');
        this.sprite.setTint(0xff00ff);
    }

    linkGate(gate: Gate) {
        this.linkedGate = gate;
    }

    onOverlap(player: Player): void {
        if (this.linkedGate) {
            this.linkedGate.open();
        }
    }
}
