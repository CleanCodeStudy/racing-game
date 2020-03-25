package racing.view;

import racing.domain.RacingTurn;

import java.util.List;

public class OutputView {
    private static final String CAR_FOOTPRINT = "-";
    private static final String RACING_RESULT_NOTICE = "실행 결과";
    private static final String INPUT_CAR_NUMBERS_NOTICE = "자동차 대수는 몇 대 인가요?";
    private static final String INPUT_GAME_TURNS_NOTICE = "시도 할 횟수는 몇 회 인가요?";

    public void printRacingResult(List<RacingTurn> racingTurns) {
        printStringOf(RACING_RESULT_NOTICE);
        for (RacingTurn racingTurn : racingTurns) {
            printTurnOfRacing(racingTurn.getRacingResult());
            printChangeLine();
        }
    }

    public void printInputCarNumbersNotice() {
        printStringOf(INPUT_CAR_NUMBERS_NOTICE);
    }

    public void printInputGameTurnsNotice() {
        printStringOf(INPUT_GAME_TURNS_NOTICE);
    }

    private void printTurnOfRacing(List<Integer> carDistances) {
        for (int carDistance : carDistances) {
            printCarPath(carDistance);
            printChangeLine();
        }
    }

    private void printCarPath(int carDistance) {
        for (int distance = 0; distance < carDistance; distance++) {
            System.out.print(CAR_FOOTPRINT);
        }
    }

    private void printChangeLine() {
        System.out.println();
    }

    private void printStringOf(String string) {
        System.out.println(string);
    }

}
