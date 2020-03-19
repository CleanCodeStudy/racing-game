package racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.view.RacingResult;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RacingFieldTest {

    @DisplayName("레이싱 결과가 범위 값 내에 있는 지 확인 및 턴, 차 수 확인")
    @Test
    void getRacingResult() {
        // given
        int totalTurns = 3;
        int carNumbers = 2;
        RacingField racingField = new RacingField(totalTurns, carNumbers);

        RacingResult racingResult = racingField.getRacingResult();
        List<List<Integer>> racingTurns = racingResult.getRacingTurns();

        // then
        assertThat(racingTurns.size()).isEqualTo(totalTurns);

        for (List<Integer> racingTurn : racingTurns) {
            assertThat(racingTurn.size()).isEqualTo(carNumbers);
            racingTurn.forEach(distance -> assertThat(distance).isBetween(0, totalTurns));
        }
    }
}