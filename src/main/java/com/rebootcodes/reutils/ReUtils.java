package com.rebootcodes.reutils;

import com.rebootcodes.reutils.experienceutils.Events;
import org.bukkit.plugin.java.JavaPlugin;

public final class ReUtils extends JavaPlugin {

    @Override
    public void onEnable() {

        // Register stuff for the ExperienceUtils package
        getServer().getPluginManager().registerEvents(new Events(), this);

        // tell the console that the plugin had been enabled successfully
        getServer().getConsoleSender().sendMessage("[ReUtils] §aPlugin has been enabled!");

    }

    @Override
    public void onDisable() {

        // Tell the console that the plugin has been disabled successfully
        getServer().getConsoleSender().sendMessage("[ReUtils] §cPlugin has been disabled!");

    }

}
