package racing.view;

import racing.domain.GameResult;
import racing.domain.PhaseResult;
import racing.domain.car.CarResult;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {

    public static void printGameResult(GameResult gameResult) {
        int numberOfPhase = gameResult.getNumberOfPhase();

        for (int i = 1; i <= numberOfPhase; i++) {
            PhaseResult phaseResult = gameResult.findRacingResultByPhase(i);
            printRacingResult(phaseResult);
        }

        printWinner(gameResult.getWinner());
    }

    public static void printWinner(List<String> winners) {
        String winner = winners.stream()
                .collect(Collectors.joining(","));

        System.out.println(winner + "가 최종 우승했습니다.");
    }

    private static void printRacingResult(PhaseResult phaseResult) {
        String result = phaseResult.getRaceResults().stream()
                .map(OutputView::mapping)
                .collect(Collectors.joining("\n"));

        System.out.println(result);
        System.out.println();
    }

    private static String mapping(CarResult carResult) {
        return carResult.getName() + " : " + visualize(carResult.getDistance());
    }

    public static String visualize(int target) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < target; i++) {
            builder.append("-");
        }

        return builder.toString();
    }
}
