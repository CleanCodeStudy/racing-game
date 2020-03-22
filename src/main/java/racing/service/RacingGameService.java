package racing.service;

import racing.NumberGenerator;
import racing.RandomNumberGenerator;
import racing.domain.ParticipateCars;
import racing.domain.Car;
import racing.domain.RacingGameResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RacingGameService {
    private final int numberOfAttempts;
    private ParticipateCars participateCars;

    public RacingGameService(int numberOfCars, int numberOfAttempts) {
        validateInputValue(numberOfCars, numberOfAttempts);
        this.numberOfAttempts = numberOfAttempts;
        this.participateCars = new ParticipateCars(createCars(numberOfCars));
    }

    public Map startRace(NumberGenerator numberGenerator) {
        Map<Integer, List<Integer>> attemptResults = new HashMap<>();

        for (int attemptNumber = 1; attemptNumber <= numberOfAttempts; attemptNumber++) {
            attemptResults.put(attemptNumber, participateCars.tryMove(numberGenerator));
        }

        return attemptResults;
    }

    private List<Car> createCars(int numberOfCars) {
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < numberOfCars; i++) {
            cars.add(new Car());
        }

        return cars;
    }

    private void validateInputValue(int numberOfCars, int numberOfAttempts) {
        if (numberOfCars < 0) {
            throw new IllegalArgumentException(String.format("참여할 자동차의 대수는 0 보다 커야합니다. - %s", numberOfCars));
        }

        if (numberOfAttempts < 0) {
            throw new IllegalArgumentException(String.format("시도할 횟수는 0 보다 커야합니다. - %s", numberOfAttempts));
        }
    }
}
