package me.ayl.imposters.lobby.item;

import lombok.Getter;
import org.bukkit.Material;

@Getter
public class LobbyItem {

    private final Material material;

    private LobbyItemListener listener;

    public LobbyItem(Material material) {
        this.material = material;
    }

    public LobbyItem withListener(LobbyItemListener listener) {
        this.listener = listener;
        return this;
    }
}
