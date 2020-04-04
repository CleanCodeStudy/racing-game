package racing.domain.support;

import racing.util.RandomGenerator;

public class DefaultEngine implements Engine {

    private static final int MOVE_CONDITION = 4;

    @Override
    public boolean enough() {
        return isMovable(RandomGenerator.pickRandomNumber());
    }

    private boolean isMovable(final int power) {
        return power >= MOVE_CONDITION;
    }
}
