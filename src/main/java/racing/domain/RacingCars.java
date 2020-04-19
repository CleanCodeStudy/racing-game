package racing.domain;

import racing.domain.support.Engine;
import racing.vo.CarOfPerRound;
import racing.vo.RacingCarsOfPerRound;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RacingCars {

    private final List<Car> cars;

    public RacingCars(final int numberOfCar) {
        if (numberOfCar <= 0) {
            throw new IllegalArgumentException("0대 이하의 차는 경기할 수 없습니다");
        }
        this.cars = createCar(numberOfCar);
    }

    private List<Car> createCar(int numberOfCar) {
        List<Car> cars = new ArrayList<>(numberOfCar);
        for (int i = 0; i < numberOfCar; i++) {
            cars.add(new Car());
        }
        return cars;
    }

    public RacingCarsOfPerRound runWith(Engine engine) {
        List<CarOfPerRound> carOfPerRounds = new ArrayList<>(cars.size());
        for (Car car : cars) {
            car.tryMoveWith(engine);
            carOfPerRounds.add(new CarOfPerRound(car));
        }
        return new RacingCarsOfPerRound(carOfPerRounds);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RacingCars that = (RacingCars) o;
        return Objects.equals(cars, that.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }
}
