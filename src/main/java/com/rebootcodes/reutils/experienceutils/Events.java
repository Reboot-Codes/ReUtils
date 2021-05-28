package com.rebootcodes.reutils.experienceutils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Events implements Listener {

    @EventHandler
    public void onPlayerJoin (PlayerJoinEvent e) {

        // Cast the event into a player object that we can reference.
        Player player = e.getPlayer();

        // Set the public join message
        e.setJoinMessage(ChatColor.GOLD + "[" + ChatColor.GREEN + "+" + ChatColor.GOLD + "] " + ChatColor.WHITE + player.getDisplayName());
        // Send the player a message, welcoming them into their server.
        player.sendMessage(ChatColor.AQUA + "Welcome to the server " + ChatColor.AQUA + ChatColor.BOLD + player.getName() + ChatColor.AQUA + "! :D");

    }

    @EventHandler
    public void onPlayerQuit (PlayerQuitEvent e) {

        // Cast the event into a player object that we can reference.
        Player player = e.getPlayer();

        // Set the public join message
        e.setQuitMessage(ChatColor.GOLD + "[" + ChatColor.RED + "-" + ChatColor.GOLD + "] " + ChatColor.WHITE + player.getDisplayName());

    }

}
