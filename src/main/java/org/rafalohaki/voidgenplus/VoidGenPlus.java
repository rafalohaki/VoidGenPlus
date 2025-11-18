package org.rafalohaki.voidgenplus;

import org.bstats.bukkit.Metrics;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;
import org.rafalohaki.voidgenplus.generator.VoidChunkGenerator;

/**
 * VoidGenPlus - Folia compatible void world generator
 * Generates void worlds with a single bedrock block at spawn (0,0)
 * Thread-safe for Folia region-based multithreading
 */
public final class VoidGenPlus extends JavaPlugin {

    @Override
    public void onEnable() {
        // Initialize bStats metrics
        int pluginId = 26453;
        new Metrics(this, pluginId);

        // Log successful plugin loading
        getLogger().info("VoidGenPlus v" + getPluginMeta().getVersion() + " loaded successfully on Folia.");
    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        // Return thread-safe void chunk generator
        return new VoidChunkGenerator();
    }
}
