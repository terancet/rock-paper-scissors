package com.rock.paper.scissors.game.service.player.simulator;

import com.rock.paper.scissors.game.model.PlayerAction;
import com.rock.paper.scissors.game.service.PlayerActionSimulator;
import com.rock.paper.scissors.game.service.impl.player.simulator.DetermenisticPlayerActionSimulator;
import com.rock.paper.scissors.game.service.impl.random.generators.OnlyOneValueProvider;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class DetermenisticPlayerActionSimulatorTest {
    private static final String PLAYER_NAME = "Player 1";
    private final PlayerActionSimulator sut = DetermenisticPlayerActionSimulator.of(PLAYER_NAME, new OnlyOneValueProvider());

    @Test
    public void shouldReturnRockActionForNonRandomActionGenerator() {
        Assertions.assertThat(sut.generate())
                .isNotNull()
                .isEqualTo(PlayerAction.ROCK);
    }

    @Test
    public void shouldGetPlayerName() {
        Assertions.assertThat(sut.name())
                .isNotNull()
                .isNotBlank()
                .isEqualTo(PLAYER_NAME);
    }
}
