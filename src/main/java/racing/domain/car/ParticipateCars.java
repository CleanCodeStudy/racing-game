package racing.domain.car;

import racing.domain.common.NumberGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParticipateCars {
    private final List<Car> cars;

    public ParticipateCars(String[] namesOfCars) {
        cars = createCars(namesOfCars);
    }

    public List<CarResult> moveCars(NumberGenerator numberGenerator) {
        List<CarResult> carResults = new ArrayList<>();

        for (Car car : cars) {
            int afterMove = car.attemptToMove(numberGenerator.generateNumber());
            carResults.add(new CarResult(car.getName(), afterMove));
        }

        return carResults;
    }

    private List<Car> createCars(String[] namesOfCars) {
        return Arrays.stream(namesOfCars)
                .map(String::trim)
                .map(Car::new)
                .collect(Collectors.toList());
    }
}
