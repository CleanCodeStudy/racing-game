package racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import racing.domain.FixedNumberGenerator;
import racing.domain.GameInfo;
import racing.domain.RacingCar;
import racing.domain.RacingCars;

import static org.junit.jupiter.api.Assertions.*;

class RacingGameTest {

    @ParameterizedTest
    @DisplayName("모든 라운드가 4보다 크거나 같을 시 움직이고, 4보다 작을 시 멈춰있는지 확인.")
    @CsvSource(value = {"1,4", "2,5", "3,9"})
    public void runMoveTest(int holdNum, int moveNum) {
        String carNames = "car1, car2, car3";
        String roundCount = "3";
        GameInfo gameInfo = new GameInfo(carNames, roundCount);
        RacingCars holdRacingCars = new RacingCars(gameInfo.getCarNames());
        RacingCars moveRacingCars = new RacingCars(gameInfo.getCarNames());
        RacingGame holdRacingGame = new RacingGame(gameInfo, holdRacingCars);
        RacingGame moveRacingGame = new RacingGame(gameInfo, moveRacingCars);

        // when
        holdRacingGame.run(new FixedNumberGenerator(holdNum));
        moveRacingGame.run(new FixedNumberGenerator(moveNum));

        // then
        holdRacingCars.getRacingCars().stream().allMatch(m -> m.getLastPosition() == 1);
        holdRacingCars.getRacingCars().stream().allMatch(m -> m.getLastPosition() == Integer.parseInt(roundCount) + 1);
    }

}