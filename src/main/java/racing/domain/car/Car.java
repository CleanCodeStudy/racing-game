package racing.domain.car;

public class Car {
    private static final int MOVE_CONIDTION = 4;
    private int distance;
    private String name;

    public Car(String name) {
        this.name = name;
        this.distance = 0;
    }

    public String getName() {
        return name;
    }

    public int attemptToMove(int randomNumber) {
        if (isMove(randomNumber)) {
            distance++;
        }
        return distance;
    }

    private boolean isMove(int randomNumber) {
        return randomNumber >= MOVE_CONIDTION;
    }
}
