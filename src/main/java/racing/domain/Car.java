package racing.domain;

import racing.domain.support.Engine;

public class Car {

    private int location;

    public Car() {
    }

    public Car(Car car) {
        this.location = car.getLocation();
    }

    public int tryMoveWith(Engine engine) {
        if (engine.enough()) {
            location++;
        }
        return this.location;
    }

    public int getLocation() {
        return location;
    }
}
