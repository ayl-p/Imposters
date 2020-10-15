package me.ayl.imposters.util;

import lombok.RequiredArgsConstructor;
import me.ayl.imposters.Imposters;
import org.bukkit.Bukkit;
import org.bukkit.Location;

@RequiredArgsConstructor
public class CustomLocation {

    private final String world;
    private final int x, y, z;

    public Location toBukkitLocation() {
        return new Location(Bukkit.getWorld(world), x, y, z);
    }
}
