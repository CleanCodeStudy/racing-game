package racing.domain;

import racing.domain.common.NumberGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParticipateCars {
    private final List<Car> cars;

    public ParticipateCars(int numberOfCars) {
        this.cars = createCars(numberOfCars);
    }

    public List<Integer> tryMove(NumberGenerator numberGenerator) {
        return cars.stream()
                .map(car -> car.attemptToMove(numberGenerator.generateNumber()))
                .collect(Collectors.toList());
    }

    private List<Car> createCars(int numberOfCars) {
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < numberOfCars; i++) {
            cars.add(new Car());
        }

        return cars;
    }
}
