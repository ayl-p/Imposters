package me.ayl.imposters.profile.listener;

import lombok.RequiredArgsConstructor;
import me.ayl.imposters.profile.Profile;
import me.ayl.imposters.profile.handler.ProfileHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;

@RequiredArgsConstructor
public final class ProfileListeners implements Listener {

    private final ProfileHandler profileHandler;

    public void onAsyncPlayerPreLoginEvent(AsyncPlayerPreLoginEvent event) {
        Profile profile = profileHandler.get(event.getUniqueId());
    }
}
