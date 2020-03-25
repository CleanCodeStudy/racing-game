package racing.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingField {
    private final int totalTurns;
    private final List<Car> cars;

    private List<RacingTurn> racingTurns;

    public RacingField(int totalTurns, int carNumbers) {
        this.totalTurns = totalTurns;
        this.cars = createCars(carNumbers);
        this.racingTurns = createRacingResult();
    }

    public List<RacingTurn> getRacingTurns() {
        return racingTurns;
    }

    private List<RacingTurn> createRacingResult() {
        List<RacingTurn> racingTurns = new ArrayList<>();
        for (int turn = 0; turn < totalTurns; turn++) {
            nextTurn();
            RacingTurn racingTurn = new RacingTurn(getCarDistances());
            racingTurns.add(racingTurn);
        }
        return racingTurns;
    }

    private void nextTurn() {
        cars.forEach(Car::move);
    }

    private List<Integer> getCarDistances() {
        return cars.stream()
                .map(Car::getDrivenDistance)
                .collect(Collectors.toList());
    }

    private List<Car> createCars(int carNumbers) {
        List<Car> cars = new ArrayList<>();
        Mover mover = new CarMover();
        for (int i = 0; i < carNumbers; i++) {
            Car car = new Car(mover);
            cars.add(car);
        }
        return cars;
    }
}
