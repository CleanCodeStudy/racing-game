package racing.domain;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    public static RacingCars createRacingCars(List<String> carNames, Mover mover) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            Car car = new Car(carName, mover);
            cars.add(car);
        }
        return new RacingCars(cars);
    }
}
