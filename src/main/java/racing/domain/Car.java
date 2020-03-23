package racing.domain;

public class Car {
    private static final int MOVE_CONIDTION = 4;
    private int distance;

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
