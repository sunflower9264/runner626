import Phaser from 'phaser';
import { Trap, BounceBall, SpeedStrip, Gate, Switch, MapElement } from '../entities/MapElements';

export class MapManager {
    private scene: Phaser.Scene;
    private mapData: any;
    private levelConfig: any;
    private currentStage: string = 'stage0';
    private currentLevelIndex: number = 0;

    private groundGroup: Phaser.Physics.Arcade.StaticGroup;
    private elementsGroup: Phaser.Physics.Arcade.Group;
    private gates: Gate[] = [];

    private readonly TILE_SIZE = 8;
    private readonly CHUNK_WIDTH = 100; // tiles
    private readonly CHUNK_HEIGHT = 30; // tiles

    constructor(scene: Phaser.Scene) {
        this.scene = scene;
        this.groundGroup = scene.physics.add.staticGroup();
        this.elementsGroup = scene.physics.add.group({ allowGravity: false, immovable: true });
    }

    async loadLevel(levelIndex: number) {
        this.currentLevelIndex = levelIndex;

        // Load config if not loaded
        if (!this.levelConfig) {
            const response = await fetch('map_data/level_config.json');
            this.levelConfig = await response.json();
        }

        // Determine stage based on level index
        // Simple mapping for now, or use levelConfig.stageLevelMapping
        let stageName = 'stage0';
        for (const [stage, levels] of Object.entries(this.levelConfig.stageLevelMapping)) {
            if ((levels as number[]).includes(levelIndex)) {
                stageName = stage;
                break;
            }
        }

        if (this.currentStage !== stageName || !this.mapData) {
            const response = await fetch(`map_data/${stageName}.json`);
            this.mapData = await response.json();
            this.currentStage = stageName;
        }

        this.buildLevel(levelIndex);
    }

    private buildLevel(levelIndex: number) {
        // Clear existing
        this.groundGroup.clear(true, true);
        this.elementsGroup.clear(true, true);
        this.gates = [];

        const sequence = this.levelConfig.chunkSequences[levelIndex];
        let xOffset = 0;

        for (const chunkId of sequence) {
            const chunk = this.mapData.chunks.find((c: any) => c.id === chunkId);
            if (chunk) {
                this.renderChunk(chunk, xOffset);
                xOffset += this.CHUNK_WIDTH * this.TILE_SIZE;
            }
        }

        // Set world bounds
        this.scene.physics.world.setBounds(0, 0, xOffset, 640);
    }

    private renderChunk(chunk: any, xOffset: number) {
        // Render Terrain
        chunk.terrain.forEach((row: number[], y: number) => {
            row.forEach((tileId: number, x: number) => {
                if (tileId !== 0) {
                    const worldX = xOffset + x * this.TILE_SIZE;
                    const worldY = y * this.TILE_SIZE;

                    // Map tile IDs to visual elements
                    // This is a simplified mapping. Real game has many tiles.
                    // We focus on the ground and requested elements.

                    if (this.isGround(tileId)) {
                        const tile = this.groundGroup.create(worldX, worldY, 'ground_tile');
                        tile.setOrigin(0, 0);
                        tile.setDisplaySize(this.TILE_SIZE, this.TILE_SIZE);
                        tile.refreshBody();
                    } else if (tileId === 21 || tileId === 35 || tileId === 48 || tileId === 131) {
                        // Traps
                        const trap = new Trap(this.scene, worldX + 4, worldY + 4);
                        this.elementsGroup.add(trap.displayObject);
                    } else if (tileId === 56) {
                        // Bounce Ball
                        const ball = new BounceBall(this.scene, worldX + 4, worldY + 4);
                        this.elementsGroup.add(ball.displayObject);
                    } else if (tileId === 3) {
                        // Speed Strip (Fast)
                        const strip = new SpeedStrip(this.scene, worldX + 4, worldY + 4, 'fast');
                        this.elementsGroup.add(strip.displayObject);
                    } else if (tileId === 4) {
                        // Speed Strip (Slow)
                        const strip = new SpeedStrip(this.scene, worldX + 4, worldY + 4, 'slow');
                        this.elementsGroup.add(strip.displayObject);
                    } else if (tileId === 57) {
                        // Gate
                        const gate = new Gate(this.scene, worldX + 4, worldY + 4);
                        this.gates.push(gate);
                        this.elementsGroup.add(gate.displayObject);
                    } else if (tileId === 58) {
                        // Switch
                        const sw = new Switch(this.scene, worldX + 4, worldY + 4);
                        // Link to the nearest gate ahead? Or just all gates in this chunk?
                        // For simplicity, link to the last created gate if any
                        if (this.gates.length > 0) {
                            sw.linkGate(this.gates[this.gates.length - 1]);
                        }
                        this.elementsGroup.add(sw.displayObject);
                    }
                }
            });
        });
    }

    private isGround(tileId: number): boolean {
        // Based on map_generator.py colors and common sense
        // 1, 2, 28-32 seem to be ground
        return [1, 2, 7, 8, 9, 10, 11, 12, 13, 23, 28, 29, 30, 31, 32, 54].includes(tileId);
    }

    getGroundGroup() {
        return this.groundGroup;
    }

    getElementsGroup() {
        return this.elementsGroup;
    }
}
