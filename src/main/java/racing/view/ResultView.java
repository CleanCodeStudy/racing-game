package racing.view;

import racing.domain.CarData;
import racing.domain.RacingResult;

import java.util.List;

public class ResultView {
    private static final String OPERATE_RESULT = "실행 결과";
    private static final String DISTANCE = "-";
    private static final String ENTER = "\n";
    private static final String BORDER = "라운드 종료!!";

    public ResultView() {
        printEmpty();
        System.out.println(OPERATE_RESULT);
    }

    public void printResult(RacingResult racingResult, int carCount) {
        for (int racingIdx = 0; racingIdx < racingResult.size(); racingIdx++) {
            printCarName(racingResult.get(racingIdx));
            printDistance(racingResult.get(racingIdx));
            checkEachRound(racingIdx, carCount);
        }
        printEmpty();
        printWinner(racingResult.getWinners());
    }

    private void printCarName(CarData carData) {
        System.out.print(carData.getName() + " : ");
    }

    private void printDistance(CarData carData) {
        for (int length = 0; length < carData.getDistance(); length++) {
            System.out.print(DISTANCE);
        }
        printEmpty();
    }

    private void checkEachRound(int racingIdx, int carCount) {
        if (isLastCar(racingIdx, carCount)) {
            System.out.println(BORDER);
        }
    }

    private boolean isLastCar(int racingIdx, int carCount) {
        return (racingIdx + 1) % carCount == 0;
    }

    private void printEmpty() {
        System.out.print(ENTER);
    }

    private void printWinner(List<String> winners) {
        int lastIdx = winners.size() - 1;
        for (int winnerIdx = 0; winnerIdx < lastIdx; winnerIdx++) {
            System.out.print(winners.get(winnerIdx) + ",");
        }
        System.out.println(winners.get(lastIdx) + "가 최종 우승했습니다.");
    }
}
