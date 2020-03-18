package racing.domain;

import racing.util.RandomGenerator;

public class Car {

    private static final int MOVE_CONDITION = 5;
    private static final String TRACK_SIGNATURE = "-";

    private int location;

    public int runUpto(int countOfMovement) {
        for (int i = 0; i < countOfMovement; i++) {
            move();
        }
        return location;
    }

    private void move() {
        if (isMovable()) {
            location++;
        }
    }

    private boolean isMovable() {
        return RandomGenerator.pickRandomNumber() > MOVE_CONDITION;
    }

    public String createTrack() {
        StringBuilder track = new StringBuilder();
        for (int i = 0; i < location; i++) {
            track.append(TRACK_SIGNATURE);
        }
        return track.toString();
    }

}
