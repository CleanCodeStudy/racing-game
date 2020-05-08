package racing.domain;

import racing.input.InputValue;

public class GameInfo {

    private int racingCarCount;
    private int roundCount;

    public GameInfo(InputValue inputValue) {
        this.racingCarCount = inputValue.getRacingCarCounts();
        hasRacingCars();
        this.roundCount = inputValue.getRoundCounts();
    }

    public void isRemainRound() {
        if (roundCount <= 0) {
            throw new ArithmeticException("남은 라운드가 없습니다.");
        }
    }

    private void hasRacingCars() {
        if (racingCarCount == 0) {
            throw new ArithmeticException("경주에 참여하는 자동차가 없습니다.");
        }
    }

    public int getRacingCarCount() {
        return racingCarCount;
    }

    public int getRoundCount() {
        return roundCount;
    }
}
