package racing;

import racing.util.InputHelper;
import racing.view.OutputView;

public class RacingGameApplication {

    public static void main(String[] args) {

        OutputView outputView = new OutputView();
        InputHelper inputHelper = new InputHelper(outputView);

        int carNumbers = inputHelper.getCarNumbers();
        int totalGameTurns = inputHelper.getTotalGameTurns();

        RacingField racingField = new RacingField(totalGameTurns, carNumbers);

        outputView.printRacingResult(racingField.getRacingResult());
    }
}
