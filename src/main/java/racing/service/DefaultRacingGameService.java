package racing.service;

import racing.domain.RacingCars;
import racing.dto.RacingGameInfo;
import racing.view.OutputView;

public class DefaultRacingGameService implements RacingGameService {

    private static final int GAME_COUNT = 5;

    private final RacingGameInfo racingGameInfo;
    private final RacingCars racingCars;

    public DefaultRacingGameService(final RacingGameInfo racingGameInfo) {
        this.racingGameInfo = racingGameInfo;
        this.racingCars = new RacingCars(racingGameInfo.getNumberOfCar());
    }

    public void race() {
        for (int i = 0; i < GAME_COUNT; i++) {
            racingCars.runUpTo(racingGameInfo.getCountOfMovement());
        }
    }

    public void announceResult() {
        OutputView.printResult(racingCars.createTrack());
    }

    public RacingCars getRacingCars() {
        return racingCars;
    }
}
