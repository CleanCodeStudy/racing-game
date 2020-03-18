package racing.service;

import racing.domain.Car;
import racing.domain.RacingCars;
import racing.dto.RacingGameInfo;
import racing.util.OutputView;

import java.util.ArrayList;
import java.util.List;

public class DefaultRacingGameService {

    private final RacingGameInfo racingGameInfo;
    private final RacingCars racingCars;

    public DefaultRacingGameService(RacingGameInfo racingGameInfo) {
        this.racingGameInfo = racingGameInfo;
        this.racingCars = createRacingCar(racingGameInfo.getNumberOfCar());
    }

    private RacingCars createRacingCar(int numberOfCar) {
        List<Car> cars = new ArrayList<>(numberOfCar);
        for (int i = 0; i < numberOfCar; i++) {
            cars.add(new Car());
        }
        return new RacingCars(cars);
    }

    public void race() {
        for (int i = 0; i < RacingGameInfo.getGameCount(); i++) {
            racingCars.runUpto(racingGameInfo.getCountOfMovement());
        }
    }

    public void announdResult() {
        OutputView.printResult(racingCars.createTrack());
    }

    public RacingCars getRacingCars() {
        return racingCars;
    }
}
