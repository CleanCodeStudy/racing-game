package racing;

import racing.domain.DefaultEngine;
import racing.dto.RacingGameInfo;
import racing.service.RacingGameService;
import racing.view.InputView;
import racing.view.OutputView;

public class RacingController {

    public static void main(String[] args) {
        RacingGameInfo racingGameInfo = new RacingGameInfo(InputView.askNumberOfCar(), InputView.askCountOfMovement());
        RacingGameService racingGameService = new RacingGameService(racingGameInfo);

        racingGameService.raceWith(new DefaultEngine());

        OutputView.printResult(racingGameService.getRacingGameResult());
    }
}
