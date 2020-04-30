package racing.view;

import java.util.ArrayList;
import java.util.List;

public class OutputView {

    private static final String START = "\n실행 결과\n";

    private static List<RoundView> roundViews;

    public static void initOutputView(int roundCount) {
        roundViews = new ArrayList<>();

        for (int i = 0; i < roundCount; i++) {
            roundViews.add(new RoundView());
        }
    }

    public static void printAllRoundResult() {
        printStart();
        for (RoundView roundView : roundViews) {
            roundView.printCurrentRoundView();
        }
    }

    public static void printRoundResult(int round) {
        roundViews.get(round).printCurrentRoundView();
    }

    public static void printStart() {
        System.out.println(START);
    }

    public static List<RoundView> getRoundViews() {
        return roundViews;
    }
}

