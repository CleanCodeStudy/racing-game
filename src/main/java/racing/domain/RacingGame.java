package racing.domain;

import racing.domain.support.Engine;
import racing.dto.RacingCarsOfPerRound;
import racing.dto.RacingGameInfo;
import racing.dto.RacingGameResult;

public class RacingGame {

    private final RacingCars racingCars;
    private final RacingGameInfo racingGameInfo;
    private final RacingGameResult racingGameResult;

    public RacingGame(RacingGameInfo racingGameInfo) {
        this.racingGameInfo = racingGameInfo;
        this.racingCars = new RacingCars(racingGameInfo.getNumberOfCar());
        this.racingGameResult = new RacingGameResult();
    }

    public void raceWith(Engine engine) {
        for (int i = 1; i < racingGameInfo.getCountOfMovement() + 1; i++) {
            RacingCars racingCarPerRound = racingCars.runWith(engine);
            recordCurrentRound(i, racingCarPerRound);
        }
    }

    private void recordCurrentRound(int currentRound, RacingCars racingCars) {
        racingGameResult.record(new RacingCarsOfPerRound(currentRound, racingCars));
    }

    public RacingGameResult getRacingGameResult() {
        return racingGameResult;
    }


}
