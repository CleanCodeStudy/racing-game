package racing.domain;

import racing.domain.support.Engine;
import racing.dto.RacingGameInfo;
import racing.vo.CarSnapshot;
import racing.vo.RacingCarsSnapshot;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RacingCars {

    private final List<Car> cars;

    public RacingCars(final RacingGameInfo racingGameInfo) {
        this.cars = createCar(racingGameInfo.getCarNameGroup());
    }

    private List<Car> createCar(final List<String> carGroup) {
        List<Car> cars = new ArrayList<>(carGroup.size());
        for (String carName : carGroup) {
            cars.add(new Car(carName));
        }
        return cars;
    }

    public RacingCarsSnapshot runWith(final int round, final Engine engine) {
        List<CarSnapshot> carSnapshots = new ArrayList<>(cars.size());
        for (Car car : cars) {
            car.tryMoveWith(engine);
            carSnapshots.add(new CarSnapshot(car.getName(), car.getLocation()));
        }
        return new RacingCarsSnapshot(round, carSnapshots);
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
