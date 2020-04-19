package racing.domain;

import racing.domain.support.Engine;
import racing.dto.RacingGameInfo;
import racing.dto.RacingGameResult;
import racing.vo.RacingCarsOfPerRound;

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
            recordCurrentRound(racingCars.runWith(engine));
        }
    }

    private void recordCurrentRound(RacingCarsOfPerRound racingCars) {
        racingGameResult.record(racingCars);
    }

    public RacingGameResult getRacingGameResult() {
        return racingGameResult;
    }


}
