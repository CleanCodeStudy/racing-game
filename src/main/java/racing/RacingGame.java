package racing;

import racing.domain.GameInfo;
import racing.domain.RacingCar;
import racing.domain.RacingCars;
import racing.util.NumberGenerator;

public class RacingGame {

    private GameInfo gameInfo;

    private RacingCars racingCars;

    public RacingGame(GameInfo gameInfo, RacingCars racingCars) {
        this.gameInfo = gameInfo;
        this.racingCars = racingCars;
    }

    public void run(NumberGenerator numberGenerator) {
        for (int i = 0; i < gameInfo.getRoundCount(); i++) {
            playNextRound(numberGenerator);
        }
    }

    private void playNextRound(NumberGenerator numberGenerator) {
        attendRacingCars(numberGenerator);
    }

    private void attendRacingCars(NumberGenerator numberGenerator) {
        for (RacingCar racingCar : racingCars.getRacingCars()) {
            racingCar.attendRound(numberGenerator);
        }
    }
}
