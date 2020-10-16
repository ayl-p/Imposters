package me.ayl.imposters.lobby.listener;

import lombok.RequiredArgsConstructor;
import me.ayl.imposters.lobby.handler.LobbyHandler;
import me.ayl.imposters.profile.Profile;
import me.ayl.imposters.profile.handler.ProfileHandler;
import me.ayl.imposters.profile.ProfileState;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;

@RequiredArgsConstructor
public final class LobbyListeners implements Listener {

    private final ProfileHandler profileHandler;
    private final LobbyHandler lobbyHandler;

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        lobbyHandler.spawn(event.getPlayer());
    }

    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Profile profile = profileHandler.get(player);

        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (profile.getState() == ProfileState.LOBBY) {
                int slot = player.getInventory().getHeldItemSlot();
                lobbyHandler.getInventory()[slot].getListener().onPlayerInteractEvent(event);
            }
        }
    }
}
