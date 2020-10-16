package me.ayl.imposters.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class NameTagEngine {

    private final Map<UUID, String> tags = new HashMap<>();

    public void setTag(Player player, ChatColor color) {
        player.getScoreboard().registerNewTeam("$" + player.getName()).setPrefix("");

        Bukkit.getOnlinePlayers().forEach(online -> {
            online.getScoreboard().registerNewTeam("$" + player.getName()).setPrefix("");
        });
    }
}
