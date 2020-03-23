package racing.view;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    public static void printGameResult(List<Integer> gameResult) {
        String result = gameResult.stream()
                .map(OutputView::visualize)
                .collect(Collectors.joining("\n"));

        System.out.println(result);
        System.out.println();
    }

    public static String visualize(int target) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < target; i++) {
            builder.append("-");
        }

        return builder.toString();
    }
}
