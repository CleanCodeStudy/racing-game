package racing.domain;

import racing.util.RandomCreator;

public enum Movement {
    MOVE("MOVE"),
    HOLD("HOLD");

    private static final int MOVE_CONDITION = 4;

    Movement(String movement) {
    }

    public static Movement nextMovement() {
        int randomValue = RandomCreator.getRandomValue();
        if (randomValue > MOVE_CONDITION) {
            return MOVE;
        }
        return HOLD;
    }
}
