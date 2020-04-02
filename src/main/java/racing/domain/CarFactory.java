package racing.domain;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    public static RacingCars createCars(int quantity, Mover mover) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            Car car = new Car(mover);
            cars.add(car);
        }
        return new RacingCars(cars);
    }
}
