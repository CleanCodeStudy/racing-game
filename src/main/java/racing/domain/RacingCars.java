package racing.domain;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RacingCars {
    private List<Car> cars;

    public RacingCars(List<Car> cars) {
        this.cars = cars;
    }

    public void move() {
        for (Car car : cars) {
            car.move();
        }
    }

    public List<Integer> getDistances() {
        return cars.stream()
                .map(Car::getDrivenDistance)
                .collect(Collectors.toList());
    }

    public List<String> getCarNames() {
        return cars.stream()
                .map(Car::getName)
                .collect(Collectors.toList());
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
