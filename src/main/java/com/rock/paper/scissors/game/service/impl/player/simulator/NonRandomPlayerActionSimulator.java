package com.rock.paper.scissors.game.service.impl.player.simulator;

import com.rock.paper.scissors.game.model.PlayerAction;
import com.rock.paper.scissors.game.service.PlayerActionSimulator;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NonRandomPlayerActionSimulator implements PlayerActionSimulator {
    private final String playerName;

    @Override
    public PlayerAction generate() {
        return PlayerAction.ROCK;
    }

    @Override
    public String name() {
        return playerName;
    }
}