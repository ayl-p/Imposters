package me.ayl.imposters.util;

import lombok.Data;
import org.bukkit.Bukkit;
import org.bukkit.Location;

@Data
public final class CustomLocation {

    private final String world;
    private final int x, y, z;

    public CustomLocation(Location location) {
        this.world = location.toString();
        this.x = location.getBlockX();
        this.y = location.getBlockY();
        this.z = location.getBlockZ();
    }

    public Location toBukkitLocation() {
        return new Location(Bukkit.getWorld(world), x, y, z);
    }
}
