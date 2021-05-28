package com.rebootcodes.reutils.experienceutils.commands;

import com.rebootcodes.reutils.ReUtils;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PlayerCommands implements CommandExecutor {

    // Suppress that we're using a deprecated methods of doing things, because I want this plugin to be able to be used on old server versions
    @SuppressWarnings("deprecation")
    public ItemStack getPlayerHead (String player) {

        JavaPlugin plugin = ReUtils.getPlugin(ReUtils.class);
        // Check if the server version contains the PLAYER_HEAD material:
        boolean isNewVersion = Arrays.stream(Material.values())
                .map(Material::name).collect(Collectors.toList()).contains("PLAYER_HEAD");
        // Set the item's material according to the server version
        Material type = Material.matchMaterial(isNewVersion ? "PLAYER_HEAD" : "SKULL_ITEM");
        assert type != null;
        ItemStack item = new ItemStack(type, 1);

        if (!isNewVersion) {
            item.setDurability((short) 3);
        }

        SkullMeta meta = (SkullMeta) item.getItemMeta();
        assert meta != null;
        assert player != null;
        meta.setOwner(player);

        item.setItemMeta(meta);

        return item;

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player)) {

            sender.sendMessage("[ReUtils] " + ChatColor.RED + "Oh Shnap! That command doesn't work from the console!");
            return true;

        }

        Player player = ((Player) sender).getPlayer();

        // Give the player a specified skull
        if (cmd.getName().equalsIgnoreCase("skull")) {

            assert player != null;
            if (args.length == 0) {

                player.sendMessage("[ExperienceUtils] " + ChatColor.AQUA + "You have been given your player head!");
                player.getInventory().addItem(getPlayerHead(player.getName()));

            } else {

                player.sendMessage("[ExperienceUtils] " + ChatColor.AQUA + "You have been given the player head of " + ChatColor.BOLD + ChatColor.AQUA + args[0] + ChatColor.AQUA + "!");
                player.getInventory().addItem(getPlayerHead(args[0]));

            }

        }

        return true;

    }

}
