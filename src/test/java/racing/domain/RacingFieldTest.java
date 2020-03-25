package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RacingFieldTest {

    @DisplayName("레이싱 결과가 범위 값 내에 있는 지 확인 및 턴, 차 수 확인")
    @Test
    void getRacingResult() {
        // given
        int totalTurns = 3;
        int carNumbers = 2;
        RacingField racingField = new RacingField(totalTurns, carNumbers);

        List<RacingTurn> racingTurns = racingField.getRacingTurns();

        // then
        assertThat(racingTurns.size()).isEqualTo(totalTurns);

        for (RacingTurn racingTurn : racingTurns) {
            List<Integer> racingResult = racingTurn.getRacingResult();
            assertThat(racingResult.size()).isEqualTo(carNumbers);
            racingResult.forEach(distance -> assertThat(distance).isBetween(0, totalTurns));
        }
        // 여기서 for문 쓰지 말라고 했던거 기억나는데.. 어떻게 하면 좋을지 모르겠습니다..
    }
}