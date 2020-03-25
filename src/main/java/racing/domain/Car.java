package racing.domain;

public class Car {
    private int drivenDistance = 0;
    private Mover carMover;

    public Car(Mover mover) {
        carMover = mover;
    }

    public void move() {
        drivenDistance += carMover.moveResult();
    }

    public int getDrivenDistance() {
        return drivenDistance;
    }
}
