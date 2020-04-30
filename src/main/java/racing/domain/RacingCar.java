package racing.domain;

public class RacingCar {

    private StringBuilder position = new StringBuilder("-");

    public void attendRound() {
        if (Movement.nextMovement().equals(Movement.MOVE)) {
            move();
        }
    }

    private void move() {
        position.append("-");
    }

    public StringBuilder getPosition() {
        return position;
    }
}
