package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RacingFieldTest {

    @DisplayName("레이싱 게임 입력 턴 수에 따른 결과 턴 수 확인")
    @Test
    void racingTurnsSizeCheck() {
        // given
        int totalTurns = 3;
        RacingCars emptyCars = new RacingCars(Collections.emptyList());
        RacingField racingField = new RacingField(totalTurns, emptyCars);

        // when
        List<RacingTurn> racingTurns = racingField.race();

        // then
        assertThat(racingTurns.size()).isEqualTo(totalTurns);
    }

    @DisplayName("레이싱 게임 시작 후 레이싱 결과가 제대로 나오는지 확인")
    @Test
    void asdf() {
        // given
        Car car = new Car(() -> true);
        List<Car> cars = Arrays.asList(car);

        RacingCars racingCars = new RacingCars(cars);
        int totalTurns = 1;

        RacingField racingField = new RacingField(totalTurns, racingCars);

        RacingTurn expectedRacingTurn = new RacingTurn(Arrays.asList(1));
        // 밑은 리스트니까 얘또 리스트로 묶어서 ㅁ비교를 하는게 낫다.

        // when
        List<RacingTurn> racingTurns = racingField.race();

        // then
        assertThat(racingTurns.get(0).getRacingResult()).isEqualTo(expectedRacingTurn.getRacingResult());
        // equals를 통해서 테스트를 하느 편이 더 낫다.
    }
}