package racing.input;

public class InputValue {

    private int racingCarCounts;
    private int roundCounts;

    public InputValue(String racingCarCounts, String roundCounts) {
        validInputValue(racingCarCounts, roundCounts);
        this.racingCarCounts = Integer.parseInt(racingCarCounts);
        this.roundCounts = Integer.parseInt(roundCounts);
    }

    private void validIntegerValue(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("정수가 아닌 값이 입력 되었습니다.");
        }
    }

    private void isNegativeNumber() {
        if (racingCarCounts < 0 || roundCounts < 0) {
            throw new IllegalArgumentException("음수 값이 입력되었습니다.");
        }
    }

    private void validInputValue(String carCounts, String tryCounts) {
        validIntegerValue(carCounts);
        validIntegerValue(tryCounts);
        isNegativeNumber();
    }

    public int getRacingCarCounts() {
        return racingCarCounts;
    }

    public int getRoundCounts() {
        return roundCounts;
    }
}
