package me.pashmash.pluginhide.commands;

import me.pashmash.pluginhide.PluginHide;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ReloadCommand implements CommandExecutor {
    public ReloadCommand(String name) {
        PluginHide.getInstance().getCommand(name).setExecutor(this);
    }
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (!(sender instanceof Player player)) return false;
        if (!player.hasPermission("pluginhide.reload")) return false;


        PluginHide.getInstance().reloadConfig();
        player.sendRichMessage("<gradient:#08FB67:#ADF3FD>Reloaded</gradient>");



        return false;
    }
}
