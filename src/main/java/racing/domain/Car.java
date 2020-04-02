package racing.domain;

public class Car {
    private int drivenDistance = 0;
    private Mover carMover;

    public Car(Mover mover) {
        carMover = mover;
    }

    public void move() {
        if (carMover.canMove()) {
            drivenDistance++;
        }
    }

    public int getDrivenDistance() {
        return drivenDistance;
    }
}
