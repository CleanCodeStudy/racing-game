package racing;

import racing.view.RacingResult;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingField {

    private final int totalTurns;
    private final List<Car> cars;

    private RacingResult racingResult;

    public RacingField(int totalTurns, int carNumbers) {
        this.totalTurns = totalTurns;
        this.cars = createCars(carNumbers);
    }

    public RacingResult getRacingResult() {
        if (racingResult == null) {
            racingResult = createRacingResult();
        }
        return racingResult;
    }

    private RacingResult createRacingResult() {
        List<List<Integer>> racingTurns = new ArrayList<>();

        for (int turn = 0; turn < totalTurns; turn++) {
            nextTurn();
            racingTurns.add(getCarDistances());
        }
        return new RacingResult(racingTurns);
    }

    private void nextTurn() {
        for (Car car : cars) {
            car.move();
        }
    }

    private List<Integer> getCarDistances() {
        return cars.stream()
                .map(Car::getDrivenDistance)
                .collect(Collectors.toList());
    }

    private List<Car> createCars(int carNumbers) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < carNumbers; i++) {
            Car car = new Car();
            cars.add(car);
        }
        return cars;
    }
}
