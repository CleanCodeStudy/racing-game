package racing;

import racing.domain.GameInfo;
import racing.domain.RacingCars;
import racing.util.RandomNumberGenerator;
import racing.view.InputView;
import racing.view.OutputView;

public class RacingGameApplication {
    public static void main(String[] args) {
        GameInfo gameInfo = InputView.askGameInfo();
        RacingCars racingCars = new RacingCars(gameInfo.getCarNames());
        RacingGame racingGame = new RacingGame(gameInfo, racingCars);
        racingGame.run(new RandomNumberGenerator());
        OutputView.printResult(gameInfo, racingCars);
    }
}
