package racing.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {
    private List<Car> cars;

    public RacingCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }

    public void move() {
        for (Car car : cars) {
            car.move();
        }
    }
}
