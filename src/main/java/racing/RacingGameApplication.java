package racing;

import racing.domain.CarFactory;
import racing.domain.CarMover;
import racing.domain.RacingCars;
import racing.domain.RacingField;
import racing.view.InputHelper;
import racing.view.OutputView;

import java.util.List;

public class RacingGameApplication {
    public static void main(String[] args) {
        OutputView outputView = new OutputView();
        InputHelper inputHelper = new InputHelper(outputView);

        List<String> carNames = inputHelper.getCarNames();
        int totalGameTurns = inputHelper.getTotalGameTurns();

        RacingCars racingCars = CarFactory.createRacingCars(carNames, new CarMover());
        RacingField racingField = new RacingField(totalGameTurns, racingCars);

        outputView.printRacingResult(racingField.race());
    }
}
