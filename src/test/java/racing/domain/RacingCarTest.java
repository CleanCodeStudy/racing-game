package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RacingCarTest {

    @DisplayName("랜덤값이 4이상일때 전진하는지 확인.")
    @ValueSource(ints = {4, 5, 9})
    @ParameterizedTest
    void attendRoundMoveTest(int num) {
        // Random 으로 값이 잡히는데 테스트를 어떻게 하면 좋을지?...
        RacingCar racingCar = new RacingCar();
        racingCar.attendRound(new FixedNumberGenerator(num));
        assertEquals(2, racingCar.getRoundPosition(1));
    }

    @DisplayName("랜덤값이 4이하일때 움직이지 않는지 확인.")
    @ValueSource(ints = {1, 2, 3})
    @ParameterizedTest
    public void attendRoundHoldTest(int num) {
        // given
        RacingCar racingCar = new RacingCar();

        // when
        racingCar.attendRound(new FixedNumberGenerator(num));
        // then
        assertEquals(1, racingCar.getRoundPosition(1));
    }
}