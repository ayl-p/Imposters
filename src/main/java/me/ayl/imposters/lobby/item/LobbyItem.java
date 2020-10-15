package me.ayl.imposters.lobby.item;

import lombok.Data;
import org.bukkit.Material;

@Data
public final class LobbyItem {

    private final Material material;

    private LobbyItemListener listener;

    public LobbyItem withListener(LobbyItemListener listener) {
        this.listener = listener;
        return this;
    }
}
