package racing.service;

import racing.dto.RacingGameInfo;
import racing.view.InputView;

public class RacingGameServiceGenerator {

    public static RacingGameService generate() {
        try {
            int numberOfCar = Integer.parseInt(InputView.askNumberOfCar());
            int countOfMovement = Integer.parseInt(InputView.askCountOfMovement());

            RacingGameInfo racingGameInfo = new RacingGameInfo(numberOfCar, countOfMovement);

            return new DefaultRacingGameService(racingGameInfo);
        } catch (NumberFormatException ne) {
            throw new IllegalArgumentException("입력값에 숫자가 아닌 값은 들어올 수 없습니다");
        }
    }

}
