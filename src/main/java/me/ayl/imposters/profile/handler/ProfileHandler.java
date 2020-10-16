package me.ayl.imposters.profile.handler;

import me.ayl.imposters.profile.Profile;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ProfileHandler {

    private final Map<UUID, Profile> profiles = new HashMap<>();

    public Profile get(UUID uuid) {
        return profiles.computeIfAbsent(uuid, i -> new Profile());
    }

    public Profile get(Player player) {
        return get(player.getUniqueId());
    }
}
