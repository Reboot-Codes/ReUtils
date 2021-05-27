package com.rebootcodes.reutils;

import org.bukkit.plugin.java.JavaPlugin;

public final class ReUtils extends JavaPlugin {

    @Override
    public void onEnable() {

        // tell the console that the plugin had been enabled successfully
        getServer().getConsoleSender().sendMessage("[ReUtils] §aPlugin has been enabled!");

    }

    @Override
    public void onDisable() {

        // Tell the console that the plugin has been disabled successfully
        getServer().getConsoleSender().sendMessage("[ReUtils] §cPlugin has been disabled!");

    }

}
