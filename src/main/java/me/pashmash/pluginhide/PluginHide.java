package me.pashmash.pluginhide;

import me.pashmash.pluginhide.commands.ReloadCommand;
import me.pashmash.pluginhide.listeners.CommandListener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public final class PluginHide extends JavaPlugin {

    private static PluginHide instance;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new CommandListener(), this);
        new ReloadCommand("pluginhidereload");
    }

    public static PluginHide getInstance() {
        return instance;
    }

    public List<String> getBlockedCommands() {
        return getConfig().getStringList("blockedCommands");
    }


}
