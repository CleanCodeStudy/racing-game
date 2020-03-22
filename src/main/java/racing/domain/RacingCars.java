package racing.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {

    private final List<Car> cars;

    public RacingCars(final int numberOfCar) {
        this.cars = createCar(numberOfCar);
    }

    private List<Car> createCar(int numberOfCar) {
        List<Car> cars = new ArrayList<>(numberOfCar);
        for (int i = 0; i < numberOfCar; i++) {
            cars.add(new Car());
        }
        return cars;
    }

    public RacingCars runWith(Engine engine) {
        for (Car car : cars) {
            car.moveWith(engine.getPower());
        }
        return this;
    }

    public List<Car> getCars() {
        return cars;
    }

}
