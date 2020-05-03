package racing.domain;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {
    public static List<Car> createCar(int carCount) {
        List<Car> cars = new ArrayList<>();
        for (int carIdx = 0; carIdx < carCount; carIdx++) {
            cars.add(new Car(0));
        }
        return cars;
    }
}
