package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RacingResultTest {

    @DisplayName("자동차 이름들 나오는지 확인")
    @Test
    void getCarNames() {
        // given
        List<String> carNames = Arrays.asList("name1", "name2");
        RacingResult racingResult = new RacingResult(
                new RacingTurns(Arrays.asList(new RacingTurn(Arrays.asList(0, 0)))),
                carNames
        );
        // then
        assertThat(racingResult.getCarNames()).isEqualTo(carNames);
    }

    @DisplayName("승리자가 레이싱 결과에 따라 나오는지 확인")
    @Test
    void getWinners() {
        // given
        List<String> carNames = Arrays.asList("name1", "name2");
        RacingResult racingResult = new RacingResult(
                new RacingTurns(Arrays.asList(new RacingTurn(Arrays.asList(0, 1)))),
                carNames
        );
        // then
        assertThat(racingResult.getWinners()).isEqualTo(Arrays.asList("name2"));
    }
}