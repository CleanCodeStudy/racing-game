package racing;

import racing.domain.GameInfo;
import racing.domain.RacingCars;
import racing.input.InputValue;
import racing.util.RandomNumberGenerator;
import racing.view.InputView;
import racing.view.OutputView;

public class RacingGameApplication {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        inputView.run();
        InputValue inputValue = new InputValue(inputView.getCarCounts(), inputView.getTryCounts());
        GameInfo gameInfo = new GameInfo(inputValue);
        RacingCars racingCars = new RacingCars(gameInfo.getRacingCarCount());
        RacingGame racingGame = new RacingGame(gameInfo, racingCars);
        racingGame.run(new RandomNumberGenerator());
        OutputView outputView = new OutputView(gameInfo, racingCars);
        outputView.printGameResult();
    }
}
