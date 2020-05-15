package racing.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GameInfo {

    public static final int MOVE_CONDITION = 4;
    private final List<String> carNames;
    private int roundCount;

    public GameInfo(String racingCarNames, String roundCounts) {
        validInputValue(racingCarNames, roundCounts);
        this.carNames = splitCarNames(racingCarNames);
        this.roundCount = Integer.parseInt(roundCounts);
    }

    private List<String> splitCarNames(String racingCars) {
        return Arrays.stream(racingCars.split(",")).map(String::trim).collect(Collectors.toList());
    }

    private void validRacingCarCount(String racingCarNames) {
        if (isEmptyRacingCarNames(racingCarNames)) {
            throw new ArithmeticException("경주에 참여하는 자동차가 없습니다.");
        }
    }

    private boolean isEmptyRacingCarNames(String racingCarNames) {
        String[] splitNames = racingCarNames.split(",");

        if (isEmptyNames(splitNames) || splitNames.length == 0) {
            return true;
        }

        return false;
    }

    private boolean isEmptyNames(String[] names) {
        return Arrays.stream(names).map(String::trim).allMatch(s -> s.equals(""));
    }

    private void validIntegerValue(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("정수가 아닌 값이 입력 되었습니다.");
        }
    }

    private void isNegativeNumber(String roundCounts) {
        if (Integer.parseInt(roundCounts) < 0) {
            throw new IllegalArgumentException("음수 값이 입력되었습니다.");
        }
    }

    private void validInputValue(String racingCars, String roundCounts) {
        validIntegerValue(roundCounts);
        validRacingCarCount(racingCars);
        isNegativeNumber(roundCounts);
    }

    public List<String> getCarNames() {
        return new ArrayList<>(carNames);
    }

    public int getRoundCount() {
        return roundCount;
    }
}
