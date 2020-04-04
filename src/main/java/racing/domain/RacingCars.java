package racing.domain;

import racing.domain.support.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingCars {

    private final List<Car> cars;

    public RacingCars(final int numberOfCar) {
        if (numberOfCar <= 0) {
            throw new IllegalArgumentException("0대 이하의 차는 경기할 수 없습니다");
        }
        this.cars = createCar(numberOfCar);
    }

    public RacingCars(RacingCars racingCars) {
        this.cars = racingCars.getCars().stream()
                .map(Car::new)
                .collect(Collectors.toList());
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
            car.tryMoveWith(engine);
        }
        return new RacingCars(this);
    }

    public List<Car> getCars() {
        return this.cars;
    }

}
