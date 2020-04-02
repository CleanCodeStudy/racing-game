package racing.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingField {
    private final int totalTurns;
    private final List<Car> cars;

    public RacingField(int totalTurns, List<Car> cars) {
        this.totalTurns = totalTurns;
        this.cars = cars;
    }

    public List<RacingTurn> race() {
        List<RacingTurn> racingTurns = new ArrayList<>();
        for (int turn = 0; turn < totalTurns; turn++) {
            nextTurn();
            RacingTurn racingTurn = new RacingTurn(getCarDistances());
            racingTurns.add(racingTurn);
        }
        return new ArrayList<>(racingTurns);
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
}
