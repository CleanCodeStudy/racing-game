package racing.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCarFactory {

    public static List<RacingCar> getRacingCars(List<String> carNames) {
        List<RacingCar> racingCars = new ArrayList<>();

        for (String carName : carNames) {
            racingCars.add(new RacingCar(carName));
        }

        return racingCars;
    }
}
