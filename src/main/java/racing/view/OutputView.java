package racing.view;

import racing.domain.GameResult;
import racing.domain.RacingResult;

import java.util.stream.Collectors;

public class OutputView {
    private static void printRacingResult(RacingResult racingResultResult) {
        String result = racingResultResult.getRaceResults().stream()
                .map(OutputView::visualize)
                .collect(Collectors.joining("\n"));

        System.out.println(result);

    }

    public static void printGameResult(GameResult gameResult) {
        int numberOfPhase = gameResult.getNumberOfPhase();

        for (int i = 1; i <= numberOfPhase; i++) {
            RacingResult racingResult = gameResult.findRacingResultByPhase(i);
            printRacingResult(racingResult);
        }
    }

    public static String visualize(int target) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < target; i++) {
            builder.append("-");
        }

        return builder.toString();
    }
}
