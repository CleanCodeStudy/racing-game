package racing.domain;

public class Car {

    private static final int MOVE_CONDITION = 4;

    private int location;


    public void move(final int condition) {
        if (isMovable(condition)) {
            location++;
        }
    }

    private boolean isMovable(final int condition) {
        return condition >= MOVE_CONDITION;
    }

    public int getLocation() {
        return location;
    }
}
