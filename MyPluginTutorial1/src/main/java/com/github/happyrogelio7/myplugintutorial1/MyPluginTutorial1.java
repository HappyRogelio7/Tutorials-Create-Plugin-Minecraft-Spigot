package com.github.happyrogelio7.myplugintutorial1;

import com.github.happyrogelio7.myplugintutorial1.commands.MyPluginCMD;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyPluginTutorial1 extends JavaPlugin {

    private static MyPluginTutorial1 instance;

    public static MyPluginTutorial1 getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.getConsoleSender().sendMessage("MyPluginTutorial1 has been enabled!");
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&aMyPluginTutorial1 has been enabled!"));

        instance = this;

        getCommand("myplugintutorial1").setExecutor(new MyPluginCMD());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        Bukkit.getConsoleSender().sendMessage("MyPluginTutorial1 has been disabled!");
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&cMyPluginTutorial1 has been disabled!"));


    }
}
