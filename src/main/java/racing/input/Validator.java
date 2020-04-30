package racing.input;

public class Validator {
    private static final String EMPTY_CAR = "경주에 참여하는 자동차가 없습니다.";
    private static final String NOT_INTEGER_INPUT_VALUE = "정수가 아닌 값이 입력 되었습니다.";
    private static final String NOT_EXIST_ROUND = "남은 게임 횟수가 없습니다.";
    private static final String INPUT_NEGATIVE_NUMBER = "음수 값이 입력되었습니다.";
    private static int validValue;

    public static void validIntegerValue(String input) {
        try {
            validValue = Integer.parseInt(input);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(NOT_INTEGER_INPUT_VALUE);
        }
    }

    private static void inputNegativeNumber() {
        if (validValue < 0) {
            throw new IllegalArgumentException(INPUT_NEGATIVE_NUMBER);
        }
    }

    private static void zeroCar() {
        if (validValue == 0) {
            throw new IllegalArgumentException(EMPTY_CAR);
        }
    }

    public static void isNotExistRound(int round) {
        if (round == 0) {
            throw new IllegalArgumentException(NOT_EXIST_ROUND);
        }
    }

    public static void validInputCar() {
        inputNegativeNumber();
        zeroCar();
    }

    public static void validInputTryCounts() {
        inputNegativeNumber();
    }
}
