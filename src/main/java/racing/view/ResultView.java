package racing.view;

import racing.domain.RacingResult;

public class ResultView {
    private final String OPERATE_RESULT = "실행 결과";
    private final String DISTANCE = "-";
    private final String ENTER = "\n";
    private final String BORDER = "라운드 종료!!";

    public ResultView() {
        printEmpty();
        System.out.println(OPERATE_RESULT);
    }

    public void printResult(RacingResult racingResults, int carCount) {
        for (int racingIdx = 0; racingIdx < racingResults.size(); racingIdx++) {
            printDistance(racingResults.get(racingIdx));
            checkEachRound(racingIdx, carCount);
        }
        printEmpty();
    }

    private void printDistance(int distance) {
        for (int length = 0; length < distance; length++) {
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
}
