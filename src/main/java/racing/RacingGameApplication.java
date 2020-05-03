package racing;

import racing.domain.RacingGame;
import racing.dto.RacingGameInfo;
import racing.support.DefaultEngine;
import racing.view.InputView;
import racing.view.OutputView;

public class RacingGameApplication {

    public static void main(String[] args) {
        RacingGameInfo racingGameInfo = new RacingGameInfo(InputView.askNameOfCar(), InputView.askCountOfMovement());
        RacingGame racingGame = new RacingGame(racingGameInfo);

        racingGame.raceWith(new DefaultEngine());

        OutputView.printResult(racingGame.getRacingGameResult());
    }
}
