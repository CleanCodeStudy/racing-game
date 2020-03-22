package racing.domain;

import racing.NumberGenerator;
import racing.RandomNumberGenerator;

import java.util.List;
import java.util.stream.Collectors;

public class ParticipateCars {
    private final List<Car> cars;

    public ParticipateCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Integer> tryMove(NumberGenerator numberGenerator) {
        return cars.stream()
                .map(car -> car.attemptToMove(numberGenerator.generateNumber()))
                .collect(Collectors.toList());
    }
}
