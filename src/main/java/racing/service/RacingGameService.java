package racing.service;

import racing.domain.Engine;
import racing.domain.RacingCars;

public class RacingGameService {

    private final RacingCars racingCars;

    public RacingGameService(final int numberOfCar) {
        if (numberOfCar <= 0) {
            throw new IllegalArgumentException("0대 이하의 차는 경기할 수 없습니다");
        }
        this.racingCars = new RacingCars(numberOfCar);
    }

    public RacingCars raceWith(Engine engine) {
        return racingCars.runWith(engine);
    }

    public RacingCars getRacingCars() {
        return racingCars;
    }
}
