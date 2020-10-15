package me.ayl.imposters.profile;

import lombok.Data;

@Data
public class PlayerProfile {

    private PlayerState state = PlayerState.LOBBY;
}
