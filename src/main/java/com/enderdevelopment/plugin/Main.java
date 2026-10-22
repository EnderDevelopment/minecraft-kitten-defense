package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Steal a Kitten! has been enabled!");
        
        // Register commands
        this.getCommand("base").setExecutor(new BaseCommand());
        this.getCommand("collect").setExecutor(new CollectCommand());
        this.getCommand("shop").setExecutor(new ShopCommand());
        this.getCommand("codes").setExecutor(new CodesCommand());
        
        // Register events
        getServer().getPluginManager().registerEvents(new KittenEvents(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Steal a Kitten! has been disabled!");
    }
}