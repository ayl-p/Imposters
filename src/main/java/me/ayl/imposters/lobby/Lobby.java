package me.ayl.imposters.lobby;

import lombok.Getter;
import me.ayl.imposters.lobby.item.LobbyItem;
import me.ayl.imposters.lobby.item.LobbyItemListener;
import me.ayl.imposters.util.CustomLocation;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;

@Getter
public enum Lobby {

    INSTANCE;

    private final LobbyItem[] inventory = {
            new LobbyItem(Material.SKELETON_SKULL)
                    .withListener(event -> {
                        // validate that player can vote
            }),
    };

    private CustomLocation spawn;

    public void spawn(Player player) {
        player.teleport(spawn.toBukkitLocation());
    }
}
