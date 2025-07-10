package org.rafalohaki.voidgenplus;

import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.Plugin;

public class MetricsHandler {
    private final Metrics metrics;

    public MetricsHandler(Plugin plugin, int pluginId) {
        this.metrics = new Metrics(plugin, pluginId);
    }
}
