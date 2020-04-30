package racing;

import racing.view.InputView;
import racing.view.OutputView;

public class RacingGameApplication {
    public static void main(String[] args) {
        InputView.run();
        RacingGame racingGame = new RacingGame();
        racingGame.run();
        OutputView.printAllRoundResult();
    }
}
