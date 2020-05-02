package racing;

import racing.domain.GameResult;
import racing.domain.RacingGame;
import racing.domain.common.RandomNumberGenerator;
import racing.dto.InputValueDto;
import racing.view.InputView;
import racing.view.OutputView;

public class RacingGameApplication {
    public static void main(String[] args) {
        InputValueDto inputValueDto = InputView.getInputValueWithName();

        RacingGame racingGame = new RacingGame(inputValueDto);

        GameResult gameResult = racingGame.startGame(new RandomNumberGenerator());

        OutputView.printGameResult(gameResult);
    }
}
