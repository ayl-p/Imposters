package me.ayl.imposters.game.player;

import lombok.Data;

@Data
public class ImpostersPlayer {

    private int kills;

    private boolean dead = false, imposter = false;
}
