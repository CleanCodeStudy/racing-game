package racing.domain;

public class Car {

    private int location;

    public Car() {
    }

    public Car(Car car) {
        this.location = car.getLocation();
    }

    public void tryMoveWith(Engine engine) {
        location += engine.getPower();
    }

    public int getLocation() {
        return location;
    }
}
