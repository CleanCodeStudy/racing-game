package racing.domain;

import racing.domain.support.Engine;

import java.util.Objects;

public class Car {

    private int location;

    public Car() {
    }

    public Car(Car car) {
        this.location = car.getLocation();
    }

    public void tryMoveWith(Engine engine) {
        if (engine.enough()) {
            location++;
        }
    }

    public int getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return location == car.location;
    }

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }
}
