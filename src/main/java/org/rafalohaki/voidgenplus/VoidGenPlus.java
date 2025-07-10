package org.rafalohaki.voidgenplus;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;
import org.rafalohaki.voidgenplus.generator.VoidChunkGenerator;

public final class VoidGenPlus extends JavaPlugin {

    @Override
    public void onEnable() {
        // Initialize bStats metrics
        int pluginId = 26453; // Your bStats plugin ID
        new MetricsHandler(this, pluginId);
    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new VoidChunkGenerator();
    }
}
