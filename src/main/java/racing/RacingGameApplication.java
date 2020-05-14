package racing;

import racing.domain.GameInformation;
import racing.domain.GameResult;
import racing.domain.RacingGame;
import racing.domain.common.RandomNumberGenerator;
import racing.view.InputView;
import racing.view.OutputView;

public class RacingGameApplication {
    public static void main(String[] args) {
        String[] namesOfCars = InputView.inputNameOfCars();
        int numberOfAttepts = InputView.inputNumberOfAttempts();

        GameInformation gameInformation = new GameInformation(namesOfCars, numberOfAttepts);

        RacingGame racingGame = new RacingGame(gameInformation);

        GameResult gameResult = racingGame.startGame(new RandomNumberGenerator());

        OutputView.printGameResult(gameResult);
    }
}
