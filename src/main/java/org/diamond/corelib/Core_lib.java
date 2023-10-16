package org.diamond.corelib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.List;

public final class Core_lib extends JavaPlugin {
    private HashMap<String, Plugin> pluginsUsingMe = new HashMap<>();
    public static Logger logger = LoggerFactory.getLogger(Core_lib.class);
    @Override
    public void onEnable() {
        // Plugin startup logic
        logger.info("Starting Core Library");
    }
    public void addPlugin(Plugin plugin){
        pluginsUsingMe.put(plugin.getName(), plugin);
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public HashMap<String, Plugin> getPluginsUsingMe() {
        return pluginsUsingMe;
    }
}
