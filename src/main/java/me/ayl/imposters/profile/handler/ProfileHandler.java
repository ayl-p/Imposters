package me.ayl.imposters.profile;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public enum ProfileHandler {

    INSTANCE;

    private final Map<UUID, Profile> profiles = new HashMap<>();

    public Profile get(UUID uuid) {
        return profiles.computeIfAbsent(uuid, i -> new Profile(uuid));
    }

    public Profile get(Player player) {
        return get(player.getUniqueId());
    }
}
