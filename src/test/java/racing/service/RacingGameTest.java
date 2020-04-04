package racing.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racing.domain.RacingGame;
import racing.dto.RacingGameInfo;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class RacingGameTest {

    @DisplayName("경기 진행 횟수만큼 경기스냅샷을 기록한다")
    @CsvSource({"5, 5", "3, 3"})
    @ParameterizedTest
    void snapshot(int input, int expected) {
        //given
        RacingGameInfo racingGameInfo = new RacingGameInfo(String.valueOf(input), String.valueOf(input));
        RacingGame racingGame = new RacingGame(racingGameInfo);

        //when
        racingGame.raceWith(() -> true);

        //then
        assertThat(racingGame.getRacingGameResult().totalGameRound()).isEqualTo(expected);
    }

}
