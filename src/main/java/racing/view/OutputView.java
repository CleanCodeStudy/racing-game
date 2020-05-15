package racing.view;

import racing.RacingGame;
import racing.domain.GameInfo;
import racing.domain.RacingCar;
import racing.domain.RacingCars;
import racing.domain.Winners;

import java.util.*;
import java.util.stream.Collectors;

public class OutputView {

    private static final String SEPARATOR_TEXT = ", ";

    public static void printResult(GameInfo gameInfo, RacingCars racingCars) {
        System.out.println("\n실행 결과\n");
        for (int round = 0; round <= gameInfo.getRoundCount(); round++) {
            printRoundResult(racingCars, round);
            System.out.println();
        }
        System.out.println();
        printWinner(racingCars);
    }

    private static void printWinner(RacingCars racingCars) {
        Winners winners = new Winners(racingCars.getRacingCars());
        List<String> winnerNames = winners.getWinners().stream()
                .map(RacingCar::getCarName).collect(Collectors.toList());
        System.out.println(String.join(SEPARATOR_TEXT, winnerNames) + "가 최종 우승했습니다.");
    }

    private static void printRoundResult(RacingCars racingCars, int round) {
        for (RacingCar racingCar : racingCars.getRacingCars()) {
            printCarName(racingCar);
            System.out.print(" : ");
            printCarPosition(racingCar.getRoundPosition(round));
        }
    }

    private static void printCarName(RacingCar racingCar) {
        System.out.print(racingCar.getCarName());
    }

    private static void printCarPosition(int position) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < position; i++) {
            sb.append("-");
        }
        System.out.println(sb);
    }
}

