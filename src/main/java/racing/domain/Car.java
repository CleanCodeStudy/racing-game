package racing.domain;

import java.util.List;
import java.util.stream.Collectors;

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
        return randomNumber >= MOVE_CONIDTION ? true : false;
    }

    public String convertVisual() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < distance; i++) {
            stringBuilder.append("-");
        }

        return stringBuilder.toString();
    }
}
