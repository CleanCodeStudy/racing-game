package racing.dto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.vo.RacingCarsSnapshot;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RacingGameResultTest {

    @DisplayName("총 이동횟수만큼 기록이 된 상태에서 다시 기록을 시도하면 익셉션을 던진다")
    @Test
    void upperAttemptOfMovement() {
        //given
        RacingGameResult racingGameResult = new RacingGameResult(new RacingGameInfo("a, b", "5"));
        recordFiveRacingGame(racingGameResult);

        //when
        //then
        assertThatThrownBy(() -> racingGameResult.record(new RacingCarsSnapshot(6, new ArrayList<>())))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("5경기 이상 기록할 수 없습니다.");
    }

    private void recordFiveRacingGame(RacingGameResult racingGameResult) {
        racingGameResult.record(new RacingCarsSnapshot(1, new ArrayList<>()));
        racingGameResult.record(new RacingCarsSnapshot(2, new ArrayList<>()));
        racingGameResult.record(new RacingCarsSnapshot(3, new ArrayList<>()));
        racingGameResult.record(new RacingCarsSnapshot(4, new ArrayList<>()));
        racingGameResult.record(new RacingCarsSnapshot(5, new ArrayList<>()));
    }

}
