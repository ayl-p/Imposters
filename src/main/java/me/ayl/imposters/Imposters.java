package me.ayl.imposters;

import lombok.Getter;
import me.ayl.imposters.lobby.listener.LobbyListeners;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

/**
 * @author shyon
 */
public class Imposters extends JavaPlugin {

    @Getter private static Imposters instance;

    public void onEnable() {
        instance = this;

        Arrays.asList(new LobbyListeners())
                .forEach(this::register);
    }

    private void register(Listener listener) {
        getServer().getPluginManager().registerEvents(listener, this);
    }
}
