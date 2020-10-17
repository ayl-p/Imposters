package me.ayl.imposters.game;

import lombok.Getter;
import me.ayl.imposters.arena.Arena;
import me.ayl.imposters.game.player.ImpostersPlayer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.*;
import java.util.stream.Collectors;

@Getter
public class ImpostersGame {

    private final Map<UUID, ImpostersPlayer> players = new HashMap<>();
    private final Arena arena = null;

    public ImpostersGame(Player... players) {
        Arrays.stream(players).forEach(player -> this.players.put(player.getUniqueId(), new ImpostersPlayer()));
    }

    private void start() {
        getPlayers().forEach(player -> player.teleport(arena.getSpawn().toBukkitLocation()));
    }

    public List<Player> getPlayers() {
        return players.keySet()
                .stream()
                .map(Bukkit::getPlayer)
                .collect(Collectors.toList());
    }
}
