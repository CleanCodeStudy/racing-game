package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RacingTurnTest {

    @DisplayName("일급 객체 생성 테스트")
    @Test
    void racingResult() {
        // given
        RacingTurn racingTurn = new RacingTurn(Arrays.asList(1, 2, 3));

        // then
        assertThat(racingTurn).isEqualTo(new RacingTurn(Arrays.asList(1, 2, 3)));
    }

    @DisplayName("객체 생성시 넣었던 주행거리를 동일하게 뱉는지 확인")
    @Test
    void carDistanceTest() {
        // given
        List<Integer> expectedCarDistances = Arrays.asList(1, 2, 3);
        RacingTurn racingTurn = new RacingTurn(expectedCarDistances);

        // then
        assertThat(racingTurn.getCarDistances()).isEqualTo(expectedCarDistances);
    }
}