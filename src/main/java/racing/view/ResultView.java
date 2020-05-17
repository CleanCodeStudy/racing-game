package racing.view;

import racing.domain.ResultCarInfo;
import racing.domain.EachRoundResult;
import racing.domain.Winners;

import java.util.List;

public class ResultView {
    private static final String OPERATE_RESULT = "실행 결과";
    private static final String DISTANCE = "-";
    private static final String ENTER = "\n";

    public ResultView() {
        printEmpty();
        System.out.println(OPERATE_RESULT);
    }

    public void printResult(EachRoundResult eachRoundResult, Winners winners) {
        for (int roundIdx = 1; roundIdx <= eachRoundResult.size(); roundIdx++) {
            printRoundResult(eachRoundResult.getRoundResult(roundIdx));
            printEmpty();
        }
        printEmpty();
        printWinner(winners);
    }

    private void printRoundResult(List<ResultCarInfo> resultCarInfos) {
        for (ResultCarInfo resultCarInfo : resultCarInfos) {
            printCarName(resultCarInfo.getName());
            printDistance(resultCarInfo.getDistance());
            printEmpty();
        }
    }

    private void printCarName(String carName) {
        System.out.print(carName + " : ");
    }

    private void printDistance(int carDistance) {
        for (int distance = 0; distance < carDistance; distance++) {
            System.out.print(DISTANCE);
        }
    }

    private void printEmpty() {
        System.out.print(ENTER);
    }

    private void printWinner(Winners winners) {
        int lastIdx = winners.size() - 1;
        for (int winnerIdx = 0; winnerIdx < lastIdx; winnerIdx++) {
            System.out.print(winners.getName(winnerIdx) + ",");
        }
        System.out.println(winners.getName(lastIdx) + "가 최종 우승했습니다.");
    }
}
