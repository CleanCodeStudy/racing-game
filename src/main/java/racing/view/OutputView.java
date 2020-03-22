package racing.view;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    public static void printGameResult(List<Integer> gameResult) {
        String result = gameResult.stream()
                .map(distance -> visualize(distance))
                .collect(Collectors.joining("\n"));

        System.out.println(result);
    }

    public static void printWholeGameResult(List<List<Integer>> wholeGameResult) {
        System.out.println("실행 결과");
        for (List<Integer> result : wholeGameResult) {
            printGameResult(result);
            System.out.println();
        }
    }

    private static String visualize(int target) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < target; i++) {
            builder.append("-");
        }

        return builder.toString();
    }
}
