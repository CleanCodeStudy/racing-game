package racing.input;

public class InputValue {
    private static int racingCarCounts;
    private static int roundCount;

    public static void initInputValue(String carCounts, String tryCount) {
        validInputValue(carCounts, tryCount);
        racingCarCounts = Integer.parseInt(carCounts);
        roundCount = Integer.parseInt(tryCount);
    }

    private static void validInputValue(String carCounts, String tryCounts) {
        Validator.validIntegerValue(carCounts);
        Validator.validInputCar();
        Validator.validIntegerValue(tryCounts);
        Validator.validInputTryCounts();
    }

    public static int getRacingCarCounts() {
        return racingCarCounts;
    }

    public static int getRoundCount() {
        return roundCount;
    }
}
