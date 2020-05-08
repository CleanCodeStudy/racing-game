package racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racing.domain.FixedNumberGenerator;
import racing.domain.GameInfo;
import racing.domain.RacingCar;
import racing.domain.RacingCars;
import racing.input.InputValue;

import static org.junit.jupiter.api.Assertions.*;

class RacingGameTest {

    @ParameterizedTest
    @DisplayName("모든 라운드가 4보다 크거나 같을 시 움직였는지 확인.")
    @ValueSource(strings = {"4", "5", "6", "7"})
    public void runMoveTest(String roundCount) {
        int racingCarCount = 3;
        GameInfo gameInfo = new GameInfo(new InputValue(Integer.toString(racingCarCount), roundCount));
        RacingCars racingCars = new RacingCars(racingCarCount);
        RacingGame racingGame = new RacingGame(gameInfo, racingCars);

        // when
        racingGame.run(new FixedNumberGenerator(5));

        // then
        for (RacingCar racingCar : racingCars.getRacingCars()) {
            assertEquals(Integer.parseInt(roundCount), racingCar.getRoundPosition(Integer.parseInt(roundCount)-1));
        }
    }

    @ParameterizedTest
    @DisplayName("모든 라운드가 4보다 작을 시 계속 멈춰 있는지 확인.")
    @ValueSource(strings = {"1", "2", "3"})
    public void runHoldTest(String roundCount) throws Exception {
        int racingCarCount = 3;
        GameInfo gameInfo = new GameInfo(new InputValue(Integer.toString(racingCarCount), roundCount));
        RacingCars racingCars = new RacingCars(racingCarCount);
        RacingGame racingGame = new RacingGame(gameInfo, racingCars);

        // when
        racingGame.run(new FixedNumberGenerator(3));

        // then
        for (RacingCar racingCar : racingCars.getRacingCars()) {
            assertEquals(1, racingCar.getRoundPosition(Integer.parseInt(roundCount)));
        }
    }


}