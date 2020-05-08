package racing.domain;
import racing.util.NumberGenerator;

public enum Movement {
    MOVE("MOVE"),
    HOLD("HOLD");

    private static final int MOVE_CONDITION = 4;

    Movement(String movement) {
    }

    public static Movement nextMovement(NumberGenerator numberGenerator) {
        int randomValue = numberGenerator.generateNumber();
        if (randomValue >= MOVE_CONDITION) {
            return MOVE;
        }
        return HOLD;
    }

    public boolean canMove() {
        return this.equals(Movement.MOVE);
    }
}
