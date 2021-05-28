package com.rebootcodes.reutils.experienceutils.commands;

import com.rebootcodes.reutils.ReUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class GeneralCommands implements CommandExecutor {

    JavaPlugin plugin = ReUtils.getPlugin(ReUtils.class);

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        // Implement a check of the version of this plugin
        if (cmd.getName().equalsIgnoreCase("ruversion")) {

            sender.sendMessage("[ReUtils] " + ChatColor.AQUA + "Thanks for asking! The version of this plugin is: " + plugin.getDescription().getVersion());

        }

        // Make sure to return true because of API weirdness.
        return true;

    }

}
