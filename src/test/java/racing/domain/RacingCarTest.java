package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RacingCarTest {

    // TODO MovementTest 와 같은 상황이네요! 하나의 테스트로 줄일 수 있을것 같아요!
    @DisplayName("랜덤값이 4보다 크거나 같으면 움직이고 4보다 작으면 정지하는지 확인.")
    @CsvSource(value = {"1,4", "2,5","3,9"})
    @ParameterizedTest
    void attendRoundMoveTest(int holdNum, int moveNum) {
        // Random 으로 값이 잡히는데 테스트를 어떻게 하면 좋을지?...
        RacingCar racingCar1 = new RacingCar("nathan");
        racingCar1.attendRound(new FixedNumberGenerator(holdNum));
        RacingCar racingCar2 = new RacingCar("Hong");
        racingCar2.attendRound(new FixedNumberGenerator(moveNum));

        assertEquals(1, racingCar1.getRoundPosition(1));
        assertEquals(2, racingCar2.getRoundPosition(1));
    }

    @DisplayName("원하는 라운드의 위치 값을 가져오는지 확인.")
    @Test
    public void getRoundPositionTest() {
        // given
        RacingCar racingCar = new RacingCar("tesla");
        racingCar.attendRound(new FixedNumberGenerator(5));
        racingCar.attendRound(new FixedNumberGenerator(5));
        racingCar.attendRound(new FixedNumberGenerator(5));

        assertEquals(3, racingCar.getRoundPosition(2));
        assertEquals(4, racingCar.getLastPosition());
    }
}