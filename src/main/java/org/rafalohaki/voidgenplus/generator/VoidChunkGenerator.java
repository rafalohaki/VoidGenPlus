package org.rafalohaki.voidgenplus.generator;

import org.bukkit.Material;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.generator.WorldInfo;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

/**
 * Folia-compatible void chunk generator
 * Generates void worlds with a single bedrock block at spawn (0,0)
 * Thread-safe: operates on region thread automatically
 */
public class VoidChunkGenerator extends ChunkGenerator {

    @Override
    public void generateSurface(@NotNull WorldInfo worldInfo, @NotNull Random random, int chunkX, int chunkZ, @NotNull ChunkData chunkData) {
        // Place bedrock block only at spawn chunk (0,0)
        // This is thread-safe as chunk generation runs on the owning region thread
        if (chunkX == 0 && chunkZ == 0) {
            int y = worldInfo.getMinHeight();
            chunkData.setBlock(0, y, 0, Material.BEDROCK);
        }
    }

    @Override
    public boolean shouldGenerateNoise() {
        // Disable noise generation for void world
        return false;
    }

    @Override
    public boolean shouldGenerateSurface() {
        // Enable surface generation for bedrock placement
        return true;
    }

    @Override
    public boolean shouldGenerateCaves() {
        // Disable cave generation for void world
        return false;
    }

    @Override
    public boolean shouldGenerateDecorations() {
        // Disable decoration generation for void world
        return false;
    }

    @Override
    public boolean shouldGenerateMobs() {
        // Disable mob generation for void world
        return false;
    }

    @Override
    public boolean shouldGenerateStructures() {
        // Disable structure generation for void world
        return false;
    }
}
