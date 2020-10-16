package me.ayl.imposters.profile;

import lombok.Data;

import java.util.UUID;

@Data
public final class Profile {

    private final UUID uuid;

    private ProfileState state = ProfileState.LOBBY;
}
