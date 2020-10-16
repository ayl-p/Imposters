package me.ayl.imposters;

import lombok.Getter;
import me.ayl.imposters.lobby.handler.LobbyHandler;
import me.ayl.imposters.lobby.listener.LobbyListeners;
import me.ayl.imposters.profile.handler.ProfileHandler;
import me.ayl.imposters.profile.listener.ProfileListeners;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

/**
 * @author shyon
 */
@Getter
public final class Imposters extends JavaPlugin {

    private ProfileHandler profileHandler;
    private LobbyHandler lobbyHandler;

    public void onEnable() {
        profileHandler = new ProfileHandler();
        lobbyHandler = new LobbyHandler();

        Arrays.asList(new LobbyListeners(profileHandler, lobbyHandler), new ProfileListeners(profileHandler))
                .forEach(this::register);
    }

    private void register(Listener listener) {
        getServer().getPluginManager().registerEvents(listener, this);
    }
}
