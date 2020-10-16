package me.ayl.imposters.profile;

import lombok.Data;

@Data
public final class Profile {

    private ProfileState state = ProfileState.LOBBY;
}
