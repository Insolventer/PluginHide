package me.pashmash.pluginhide.listeners;

import me.pashmash.pluginhide.PluginHide;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class CommandListener implements Listener {
    @EventHandler
    public void handle (PlayerCommandPreprocessEvent event) {
        String command = event.getMessage().substring(1);
        if (PluginHide.getInstance().getBlockedCommands().contains(command)) {
            event.setCancelled(true);
            event.getPlayer().sendMessage("You do not have permission to use this command.");
        }
    }
}