package me.ayl.imposters.profile;

import lombok.Data;

@Data
public final class PlayerProfile {

    private PlayerState state = PlayerState.LOBBY;
}
