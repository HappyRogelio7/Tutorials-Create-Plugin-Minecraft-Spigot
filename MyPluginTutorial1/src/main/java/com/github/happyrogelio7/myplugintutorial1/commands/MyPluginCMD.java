package com.github.happyrogelio7.myplugintutorial1.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MyPluginCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cOnly players can execute this command!"));
            return true;
        }

        Player player = (Player) sender;

        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aHello World!"));

        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aHello, &f" + player.getName() + "&a!"));

        return true;
    }

}
