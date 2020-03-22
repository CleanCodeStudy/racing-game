package racing;

import java.util.List;

public class FixedNumberGenerator implements NumberGenerator {
    private static final int MOVE_CONDITION_NUMBER = 4;
    private static final int STOP_CONDITION_NUMBER = 3;
    private boolean condition;

    public FixedNumberGenerator() {
        this.condition = true;
    }

    @Override
    public List<Integer> generateNumber(int numberOfAttempts) {
        return null;
    }

    @Override
    public int generateNumber() {
        if (condition) {
            condition = false;
            return MOVE_CONDITION_NUMBER;
        }
        condition = true;
        return STOP_CONDITION_NUMBER;
    }
}
