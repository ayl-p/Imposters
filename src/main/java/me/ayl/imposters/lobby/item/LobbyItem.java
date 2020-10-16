package me.ayl.imposters.lobby.item;

import lombok.Data;
import org.bukkit.Material;
import org.bukkit.event.player.PlayerInteractEvent;

@Data
public final class LobbyItem {

    private final Material material;

    private LobbyItemListener listener;

    public LobbyItem withListener(LobbyItemListener listener) {
        this.listener = listener;
        return this;
    }

    public void handleInteractEvent(PlayerInteractEvent event) {
        listener.onPlayerInteractEvent(event);
    }
}
