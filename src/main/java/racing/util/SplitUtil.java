package racing.util;

import java.util.Arrays;
import java.util.List;

public class SplitUtil {
    public static List<String> split(String carNames) {
        checkEmpty(carNames);
        List<String> splitValue = Arrays.asList(carNames.split(","));

        checkCount(splitValue.size());
        checkDuplicate(splitValue);

        return splitValue;
    }

    private static void checkEmpty(String carNames) {
        if (carNames.isEmpty()) {
            throw new NullPointerException("경주할 자동차 이름을 입력하지 않았습니다.");
        }
    }

    private static void checkCount(int carCount) {
        if (carCount < 1) {
            throw new IllegalArgumentException("게임을 진행하려면 한대 이상의 자동차가 필요합니다.");
        }
    }

    private static void checkDuplicate(List<String> splitValue) {
        if (isDuplicate(splitValue)) {
            throw new IllegalArgumentException("자동차의 이름은 모두 달라야 합니다.");
        }
    }

    private static boolean isDuplicate(List<String> splitValue) {
        return splitValue
                .stream()
                .distinct()
                .count() != splitValue.size();
    }
}
