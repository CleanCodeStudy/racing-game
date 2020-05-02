package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RacingTurnsTest {

    @DisplayName("빈 RacingTurns List가 생성자의 인자이면 Exception")
    @Test
    void verifyRacingTurnsNotEmpty() {
        // then
        assertThatThrownBy(() -> new RacingTurns(Collections.emptyList()))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("RacingTurn의 개수는 0개일 수 없음.");
    }

    @DisplayName("가장 멀리간 자동차의 주행 거리 가져오기")
    @Test
    void getMaxDistance() {
        // given
        RacingTurns racingTurns = new RacingTurns(Arrays.asList(
                new RacingTurn(Arrays.asList(1, 0)),
                new RacingTurn(Arrays.asList(2, 1))
        ));

        // then
        assertThat(racingTurns.getMaxDistance()).isEqualTo(2);
    }

    @DisplayName("마지막 턴의 각 차 주행거리 가져오기")
    @Test
    void getLastTurnCarDistances() {
        // given
        RacingTurn firstTurn = new RacingTurn(Arrays.asList(1, 0));
        RacingTurn lastTurn = new RacingTurn(Arrays.asList(2, 1));
        RacingTurns racingTurns = new RacingTurns(Arrays.asList(firstTurn, lastTurn));

        // then
        assertThat(racingTurns.getLastTurnCarDistances())
                .isEqualTo(lastTurn.getCarDistances());
    }
}