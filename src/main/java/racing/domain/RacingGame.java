package racing.domain;

import racing.dto.RacingGameInfo;
import racing.dto.RacingGameResult;
import racing.support.Engine;
import racing.vo.RacingCarsSnapshot;

public class RacingGame {

    private final RacingCars racingCars;
    private final RacingGameInfo racingGameInfo;
    private final RacingGameResult racingGameResult;

    public RacingGame(RacingGameInfo racingGameInfo) {
        this(new RacingCars(racingGameInfo), racingGameInfo, new RacingGameResult(racingGameInfo));
    }

    private RacingGame(RacingCars racingCars, RacingGameInfo racingGameInfo, RacingGameResult racingGameResult) {
        this.racingCars = racingCars;
        this.racingGameInfo = racingGameInfo;
        this.racingGameResult = racingGameResult;
    }

    public void raceWith(Engine engine) {
        for (int currentRound = 1; currentRound < racingGameInfo.getCountOfMovement() + 1; currentRound++) {
            RacingCarsSnapshot snapshot = racingCars.runWith(currentRound, engine);
            recordRacingGameSnapshot(snapshot);
        }
    }

    private void recordRacingGameSnapshot(RacingCarsSnapshot racingCars) {
        racingGameResult.record(racingCars);
    }

    public RacingGameResult getRacingGameResult() {
        return racingGameResult;
    }


}
