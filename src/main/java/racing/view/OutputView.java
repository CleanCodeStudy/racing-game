package racing.view;

import racing.domain.RacingResult;
import racing.domain.RacingTurn;

import java.util.List;

public class OutputView {
    private static final String CAR_FOOTPRINT = "-";
    private static final String RACING_RESULT_NOTICE = "실행 결과";
    private static final String INPUT_GAME_TURNS_NOTICE = "시도 할 횟수는 몇 회 인가요?";
    private static final String INPUT_CAR_NAMES_NOTICE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String WINNERS_NOTICE = "가 최종 우승했습니다.";
    private static final String COMMA_DELIMITER = ", ";
    private static final String COLON_DELIMITER = " : ";

    public void printRacingResult(RacingResult racingResult) {
        printLineOf(RACING_RESULT_NOTICE);
        for (RacingTurn racingTurn : racingResult.getRacingTurns().get()) {
            printTurnOfRacing(racingResult.getCarNames(), racingTurn.getCarDistances());
            printChangeLine();
        }
        printRacingWinners(racingResult.getWinners());
    }

    public void printInputGameTurnsNotice() {
        printLineOf(INPUT_GAME_TURNS_NOTICE);
    }

    public void printInputCarNamesNotice() {
        printLineOf(INPUT_CAR_NAMES_NOTICE);
    }

    private void printRacingWinners(List<String> winners) {
        StringBuilder stringBuilder = new StringBuilder(winners.get(0));
        for (int i = 1; i < winners.size(); i++) {
            stringBuilder.append(COMMA_DELIMITER).append(winners.get(i));
        }
        stringBuilder.append(WINNERS_NOTICE);
        printLineOf(stringBuilder.toString());
    }

    private void printTurnOfRacing(List<String> carNames, List<Integer> carDistances) {
        for (int i = 0; i < carNames.size(); i++) {
            printCarName(carNames.get(i));
            printCarPath(carDistances.get(i));
            printChangeLine();
        }
    }

    private void printCarName(String carName) {
        StringBuilder stringBuilder = new StringBuilder(carName);
        stringBuilder.append(COLON_DELIMITER);
        printStringOf(stringBuilder.toString());
    }

    private void printCarPath(int carDistance) {
        for (int distance = 0; distance < carDistance; distance++) {
            System.out.print(CAR_FOOTPRINT);
        }
    }

    private void printChangeLine() {
        System.out.println();
    }

    private void printLineOf(String string) {
        System.out.println(string);
    }

    private void printStringOf(String string) {
        System.out.print(string);
    }
}
