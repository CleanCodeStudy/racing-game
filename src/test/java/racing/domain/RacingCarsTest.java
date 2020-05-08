package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RacingCarsTest {

    @ParameterizedTest
    @DisplayName("입력된 레이싱카 숫자만큼 레이싱카가 생성되었는지 확인.")
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 10})
    public void getRacingCarsTest(int num) {
        // given
        RacingCars racingCars = new RacingCars(num);

        assertEquals(num, racingCars.getRacingCars().size());
    }

    @ParameterizedTest
    @DisplayName("자동차들이 들어온 랜덤 값이 조건에 맞게 움직였는지 확인")
    @ValueSource(ints = {4, 6})
    public void attendRoundMoveTest(int num) {
        RacingCars racingCars = new RacingCars(5);
        racingCars.attendRound(new FixedNumberGenerator(num));
        for (RacingCar racingCar : racingCars.getRacingCars()) {
            assertEquals(2, racingCar.getRoundPosition(1));
        }
    }


    @ParameterizedTest
    @DisplayName("자동차들이 들어온 랜덤 값이 조건에 맞게 멈춰있는지 확인")
    @ValueSource(ints = {1, 2, 3})
    public void attendRoundHoldTest(int num) {
        RacingCars racingCars = new RacingCars(5);
        racingCars.attendRound(new FixedNumberGenerator(num));
        for (RacingCar racingCar : racingCars.getRacingCars()) {
            assertEquals(1, racingCar.getRoundPosition(1));
        }
    }
}