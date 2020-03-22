package racing;

import racing.domain.DefaultEngine;
import racing.service.RacingGameService;
import racing.view.InputView;
import racing.view.OutputView;

public class RacingController {

    public static void main(String[] args) {
        int numberOfCar = InputView.askNumberOfCar();
        int countOfMovement = InputView.askCountOfMovement();

        RacingGameService racingGameService = new RacingGameService(numberOfCar);

        for (int i = 0; i < countOfMovement; i++) {
            OutputView.printResult(racingGameService.race(new DefaultEngine()));
        }
    }
}
