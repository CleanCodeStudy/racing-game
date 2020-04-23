package racing.domain;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return drivenDistance == car.drivenDistance &&
                Objects.equals(carMover, car.carMover);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drivenDistance, carMover);
    }
}
