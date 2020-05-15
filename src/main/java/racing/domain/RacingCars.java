package racing.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {

    private final List<RacingCar> racingCars;

    public RacingCars(List<String> carNames) {
        racingCars = RacingCarFactory.getRacingCars(carNames);
    }

    public List<RacingCar> getRacingCars() {
        return new ArrayList<>(racingCars);
    }
}
