package racing.service;

import racing.domain.Engine;
import racing.domain.RacingCars;
import racing.dto.RacingGameInfo;
import racing.dto.RacingGameResult;

public class RacingGameService {

    private final RacingCars racingCars;
    private final RacingGameInfo racingGameInfo;
    private final RacingGameResult racingGameResult;

    public RacingGameService(RacingGameInfo racingGameInfo) {
        this.racingGameInfo = racingGameInfo;
        this.racingCars = new RacingCars(racingGameInfo.getNumberOfCar());
        this.racingGameResult = new RacingGameResult();
    }

    public void raceWith(Engine engine) {
        for (int i = 1; i < racingGameInfo.getCountOfMovement() + 1; i++) {
            RacingCars racingCarPerRound = racingCars.runWith(engine);
            recordCurrentRound(racingCarPerRound);
        }
    }

    private void recordCurrentRound(RacingCars racingCars) {
        racingGameResult.record(racingCars);
    }

    public RacingGameResult getRacingGameResult() {
        return racingGameResult;
    }

}
