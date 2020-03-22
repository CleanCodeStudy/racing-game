package racing;

import racing.domain.RacingGameResult;
import racing.service.RacingGameService;
import racing.view.InputView;
import racing.view.OutputView;

import java.util.List;
import java.util.Map;

public class RacingGameApplication {
    public static void main(String[] args) {
        int numberOfCars = Integer.parseInt(InputView.inputNumberOfCars());

        int numberOfAttempts = Integer.parseInt(InputView.inputNumberOfAttempts());

        RacingGameService racingGameService = new RacingGameService(numberOfCars, numberOfAttempts);

        Map<Integer, List<Integer>> attemptsResult = racingGameService.startRace(new RandomNumberGenerator());

        RacingGameResult racingGameResult = new RacingGameResult(attemptsResult);

        OutputView.printWholeGameResult(racingGameResult.getWholeResult());
    }
}
