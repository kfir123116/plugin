package me.kfir123116.Plugin;

import me.kfir123116.Plugin.Items.CustomItems;
import net.md_5.bungee.api.ChatColor;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin implements Listener {
    public void onEnable() {
    	LoadEnchantments();
    	this.getServer().getPluginManager().registerEvents(this, this);
        this.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n\nPlugin has been Enabled\n\n");
        final CustomItems items = new CustomItems();
        items.CustomRecipe();
    }
    
    private void LoadEnchantments() {		
	}

	public void onDisable() {
        this.getServer().getConsoleSender().sendMessage(ChatColor.RED + "\n\nPlugin has been Disable\n\n");
    }
}