package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.domain.common.FixedNumberGenerator;
import racing.dto.InputValueDto;

import static org.assertj.core.api.Assertions.assertThat;

class RacingGameTest {

    @DisplayName("startGame 메소드는 게임을 수행하고 결과를 가지고 있는 RacingResult를 반환한다.")
    @Test
    void name() {
        InputValueDto inputValueDto = new InputValueDto(new String[]{"pobi", "crong"}, 2);
        RacingGame racingGame = new RacingGame(inputValueDto);

        assertThat(racingGame.startGame(new FixedNumberGenerator())).isInstanceOf(GameResult.class);
    }
}