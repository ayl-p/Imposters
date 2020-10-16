package me.ayl.imposters.game;

import lombok.Data;

@Data
public class ImpostersPlayer {

    private boolean dead = false;
    private Team team = Team.INNOCENT;
}
