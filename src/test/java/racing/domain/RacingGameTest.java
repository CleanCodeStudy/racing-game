package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.dto.RacingGameInfo;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class RacingGameTest {

    @DisplayName("경기 진행 횟수만큼 경기스냅샷을 기록한다")
    @Test
    void snapshot() {
        //given
        RacingGameInfo racingGameInfo = new RacingGameInfo("a, b, c", "5");
        RacingGame racingGame = new RacingGame(racingGameInfo);

        //when
        racingGame.raceWith(() -> true);

        //then
        assertThat(racingGame.getRacingGameResult().getRacingCarsSnapshots().size()).isEqualTo(5);

    }

}
