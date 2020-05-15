package racing.domain;

import racing.util.NumberGenerator;

public class RacingCar implements Comparable<RacingCar> {

    private String carName;

    private RoundsPosition roundsPosition = new RoundsPosition();

    public RacingCar(String carName) {
        this.carName = carName;
    }

    public void attendRound(NumberGenerator numberGenerator) {
        if (canMove(numberGenerator)) {
            move();
            return;
        }
        roundsPosition.addPosition(getLastPosition());
    }

    private boolean canMove(NumberGenerator numberGenerator) {
        return numberGenerator.generateNumber() >= GameInfo.MOVE_CONDITION;
    }

    private void move() {
        roundsPosition.addPosition(getLastPosition() + 1);
    }

    public int getLastPosition() {
        return roundsPosition.peek();
    }

    public int getRoundPosition(int round) {
        return roundsPosition.getRoundPosition(round);
    }

    public String getCarName() {
        return carName;
    }

    @Override
    public int compareTo(RacingCar racingCar) {
        return racingCar.getLastPosition() - this.getLastPosition();
    }
}
