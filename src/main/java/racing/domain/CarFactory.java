package racing.domain;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    public static List<Car> createCars(int quantity, Mover mover) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            Car car = new Car(mover);
            cars.add(car);
        }
        return cars;
    }
}
