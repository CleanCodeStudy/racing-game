package racing.view;

import racing.RacingGame;
import racing.domain.GameInfo;
import racing.domain.RacingCar;
import racing.domain.RacingCars;

public class OutputView {

    private GameInfo gameInfo;

    private RacingCars racingCars;

    public OutputView(GameInfo gameInfo, RacingCars racingCars) {
        this.gameInfo = gameInfo;
        this.racingCars = racingCars;
    }

    public void printGameResult() {
        System.out.println("\n실행 결과\n");
        for (int round = 0; round <= gameInfo.getRoundCount(); round++) {
            printRoundResult(round);
            System.out.println();
        }
    }

    private void printRoundResult(int round) {
        for (RacingCar racingCar : racingCars.getRacingCars()) {
            int carRoundPosition = racingCar.getRoundPosition(round);
            printCarPosition(carRoundPosition);
        }
    }

    private void printCarPosition(int position) {
        for (int i = 0; i < position; i++) {
            System.out.printf("-");
        }
        System.out.println();
    }
}

