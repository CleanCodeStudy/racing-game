package racing.domain;

import racing.domain.common.NumberGenerator;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParticipateCars {
    private final List<Car> cars;

    public ParticipateCars(String[] namesOfCars) {
        cars = createCars(namesOfCars);
    }

    public List<Integer> tryMove(NumberGenerator numberGenerator) {
        return cars.stream()
                .map(car -> car.attemptToMove(numberGenerator.generateNumber()))
                .collect(Collectors.toList());
    }

    public Map<String, Integer> tryMoveWithName(NumberGenerator numberGenerator) {

/*        Map<String, Integer> moveResults = new LinkedHashMap<>();

        for (Car car : cars) {
            moveResults.put(car.getName(),car.attemptToMove(numberGenerator.generateNumber()));
        }

        return moveResults;*/

        return cars.stream()
                .collect(Collectors.toMap(Car::getName,
                        car -> car.attemptToMove(numberGenerator.generateNumber()),
                        (x, y) -> x,
                        LinkedHashMap::new));
    }

    private List<Car> createCars(String[] namesOfCars) {
/*        List<Car> cars = new ArrayList<>();

        for (int i = 0 ; i < namesOfCars.length ; i++) {
            cars.add(new Car(namesOfCars[i]));
        }*/

        return Arrays.stream(namesOfCars)
                .map(String::trim)
                .map(Car::new)
                .collect(Collectors.toList());
    }
}
