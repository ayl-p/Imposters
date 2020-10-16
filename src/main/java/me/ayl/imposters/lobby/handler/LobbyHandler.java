package me.ayl.imposters.lobby.handler;

import lombok.Getter;
import me.ayl.imposters.lobby.item.LobbyItem;
import me.ayl.imposters.util.CustomLocation;
import org.bukkit.Material;
import org.bukkit.entity.Player;

@Getter
public class LobbyHandler {

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
