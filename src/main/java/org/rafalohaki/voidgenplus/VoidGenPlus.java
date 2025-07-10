package org.rafalohaki.voidgenplus;

import org.bstats.bukkit.Metrics;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;
import org.rafalohaki.voidgenplus.generator.VoidChunkGenerator;

public final class VoidGenPlus extends JavaPlugin {

    @Override
    public void onEnable() {
        // Inicjalizacja bStats
        int pluginId = 26453; // Twój identyfikator bStats
        new Metrics(this, pluginId);

        // Logowanie informacji o załadowaniu pluginu
        getLogger().info("VoidGenPlus v" + getPluginMeta().getVersion() + " został pomyślnie załadowany.");
    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new VoidChunkGenerator();
    }
}
