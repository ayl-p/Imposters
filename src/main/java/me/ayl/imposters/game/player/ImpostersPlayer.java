package me.ayl.imposters.game.player;

import lombok.Data;

@Data
public class ImpostersPlayer {

    private boolean dead = false;
    private Team team = Team.INNOCENT;
}
