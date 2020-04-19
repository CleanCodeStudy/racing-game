package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.dto.RacingGameInfo;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class RacingGameTest {

    //TODO: 한번만 해도 될 듯.
    @DisplayName("경기 진행 횟수만큼 경기스냅샷을 기록한다")
    @Test
    void snapshot() {
        //given
        RacingGameInfo racingGameInfo = new RacingGameInfo("5", "5");
        RacingGame racingGame = new RacingGame(racingGameInfo);

        //when
        racingGame.raceWith(() -> true);

        //then
        assertThat(racingGame.getRacingGameResult().totalGameRound()).isEqualTo(5);
    }

}
