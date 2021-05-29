package com.rebootcodes.reutils;

import com.rebootcodes.reutils.experienceutils.Events;
import com.rebootcodes.reutils.experienceutils.commands.GeneralCommands;
import com.rebootcodes.reutils.experienceutils.commands.PlayerCommands;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class ReUtils extends JavaPlugin {

    @Override
    public void onEnable() {

        // Register stuff for the ExperienceUtils package
        experienceUtilsRegistration();

        // tell the console that the plugin had been enabled successfully
        getServer().getConsoleSender().sendMessage("[ReUtils] " + ChatColor.GREEN + "Plugin has been enabled!");

    }

    @Override
    public void onDisable() {

        // Tell the console that the plugin has been disabled successfully
        getServer().getConsoleSender().sendMessage("[ReUtils] " + ChatColor.RED + "Plugin has been disabled!");

    }

    void experienceUtilsRegistration () {

        getServer().getConsoleSender().sendMessage("[ReUtils] " + ChatColor.AQUA + "Registering events for: ExperienceUtils");
        getServer().getPluginManager().registerEvents(new Events(), this);
        getServer().getConsoleSender().sendMessage("[ReUtils] " + ChatColor.AQUA + "Registering commands for: ExperienceUtils");
        GeneralCommands euGeneralCmdInstance = new GeneralCommands();
        PlayerCommands euPlayerCmdInstance = new PlayerCommands();
        Objects.requireNonNull(getCommand("ruversion")).setExecutor(euGeneralCmdInstance);
        Objects.requireNonNull(getCommand("playerskull")).setExecutor(euPlayerCmdInstance);

    }

}
