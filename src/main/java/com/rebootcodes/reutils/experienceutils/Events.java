package com.rebootcodes.reutils.experienceutils;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Events implements Listener {

    public void onPlayerJoin (PlayerJoinEvent e) {

        // Set the public join message
        e.setJoinMessage(null);

        // Cast the event into a player object that we can reference.
        Player player = (Player) e;
        // Send the player a message, welcoming them into their server.
        player.sendMessage("§bWelcome to the server " + player.getName() + "! :D");

    }

    public void onPlayerQuit (PlayerQuitEvent e) {

        // Set the public join message
        e.setQuitMessage(null);

    }

}
