package racing.domain;

public class Car {

    private static final int MOVE_CONDITION = 4;

    private int location;


    public void moveWith(final int power) {
        if (isMovable(power)) {
            location++;
        }
    }

    private boolean isMovable(final int power) {
        return power >= MOVE_CONDITION;
    }

    public int getLocation() {
        return location;
    }
}
