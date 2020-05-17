package racing.domain;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {
    public static List<Car> createCars(List<String> carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName, 0));
        }
        return cars;
    }
}
