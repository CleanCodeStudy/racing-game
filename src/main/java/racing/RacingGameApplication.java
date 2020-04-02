package racing;

import racing.domain.*;
import racing.view.InputHelper;
import racing.view.OutputView;

import java.util.List;

public class RacingGameApplication {
    public static void main(String[] args) {
        OutputView outputView = new OutputView();
        InputHelper inputHelper = new InputHelper(outputView);

        int carNumbers = inputHelper.getCarNumbers();
        int totalGameTurns = inputHelper.getTotalGameTurns();

        List<Car> cars = CarFactory.createCars(carNumbers, new CarMover());
        RacingField racingField = new RacingField(totalGameTurns, cars);

        outputView.printRacingResult(racingField.race());
    }
}
