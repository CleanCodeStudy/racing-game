package racing;

import racing.domain.common.RandomNumberGenerator;
import racing.dto.InputValueDto;
import racing.service.RacingGameService;
import racing.view.InputView;
import racing.view.OutputView;

import java.util.List;

public class RacingGameController {
    private final RacingGameService racingGameService;
    private final InputValueDto inputValueDto;

    public RacingGameController() {
        this.inputValueDto = InputView.getInputValue();
        this.racingGameService = new RacingGameService(inputValueDto.getNumberOfCars());
    }

    public void startGame() {
        int numberOfAttempts = inputValueDto.getNumberOfAttempts();

        for (int i = 0; i < numberOfAttempts; i++) {
            List<Integer> attemptResult = racingGameService.startRace(new RandomNumberGenerator());
            printResult(attemptResult);
        }

    }

    private void printResult(List<Integer> attemptResult) {
        OutputView.printGameResult(attemptResult);
    }
}
