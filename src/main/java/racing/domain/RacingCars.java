package racing.domain;

import racing.util.NumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {

    List<RacingCar> racingCars = new ArrayList<>();

    public RacingCars(int racingCarCount) {
        createRacingCars(racingCarCount);
    }

    public void attendRound(NumberGenerator numberGenerator) {
        for (RacingCar racingCar : racingCars) {
            racingCar.attendRound(numberGenerator);
        }
    }

    private void createRacingCars(int racingCarCount) {
        for (int i = 0; i < racingCarCount; i++) {
            racingCars.add(new RacingCar());
        }
    }

    public List<RacingCar> getRacingCars() {
        return new ArrayList<>(racingCars);
    }
}
