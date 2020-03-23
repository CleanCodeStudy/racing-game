package racing.service;

import racing.domain.Car;
import racing.domain.ParticipateCars;
import racing.domain.common.NumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class RacingGameService {
    private final ParticipateCars participateCars;

    public RacingGameService(int numberOfCars) {
        List<Car> cars = createCars(numberOfCars);
        this.participateCars = new ParticipateCars(cars);
    }

    public List<Integer> startRace(NumberGenerator numberGenerator) {
        return participateCars.tryMove(numberGenerator);
    }

    private List<Car> createCars(int numberOfCars) {
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < numberOfCars; i++) {
            cars.add(new Car());
        }

        return cars;
    }
}
