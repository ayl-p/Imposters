package me.ayl.imposters.lobby.listener;

import me.ayl.imposters.lobby.Lobby;
import me.ayl.imposters.profile.PlayerProfile;
import me.ayl.imposters.profile.PlayerProfileHandler;
import me.ayl.imposters.profile.PlayerState;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public final class LobbyListeners implements Listener {

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        Lobby.INSTANCE.spawn(event.getPlayer());
    }

    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        PlayerProfile profile = PlayerProfileHandler.INSTANCE.get(player);

        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (profile.getState() == PlayerState.LOBBY) {
                int slot = player.getInventory().getHeldItemSlot();
                Lobby.INSTANCE.getInventory()[slot].getListener().onPlayerInteractEvent(event);
            }
        }
    }
}
