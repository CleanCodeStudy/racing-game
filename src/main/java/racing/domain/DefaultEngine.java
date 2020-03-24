package racing.domain;

import racing.util.RandomGenerator;

public class DefaultEngine implements Engine {

    private static final int MOVE_CONDITION = 4;
    private static final int ENGINE_POWER = 1;
    private static final int STAY_HERE = 0;

    @Override
    public int getPower() {
        int maybePower = RandomGenerator.pickRandomNumber();
        if (isMovable(maybePower)) {
            return ENGINE_POWER;
        }
        return STAY_HERE;
    }

    private boolean isMovable(final int power) {
        return power >= MOVE_CONDITION;
    }
}
