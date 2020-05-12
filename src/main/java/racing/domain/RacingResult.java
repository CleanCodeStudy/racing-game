package racing.domain;

import java.util.*;
import java.util.stream.Collectors;

public class RacingResult {
    private final List<Car> racingResult;

    public RacingResult(List<Car> racingResult) {
        this.racingResult = racingResult;
    }

    public int size() {
        return racingResult.size();
    }

    public Car get(int idx) {
        return racingResult.get(idx);
    }

    public List<String> getWinners() {
        int maxDistance = getMaxDistance();
        return racingResult
                .stream()
                .filter(car -> (car.getDistance() == maxDistance))
                .map(car -> car.getName())
                .distinct()
                .collect(Collectors.toList());
    }

    private int getMaxDistance() {
        Car maxByDistance = racingResult
                .stream()
                .max(Comparator.comparing(Car::getDistance))
                .orElseThrow(NoSuchElementException::new);

        return maxByDistance.getDistance();
    }
}
