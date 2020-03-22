package racing;

import java.util.List;

public interface NumberGenerator {
    List<Integer> generateNumber(int numberOfAttempts);

    int generateNumber();
}
