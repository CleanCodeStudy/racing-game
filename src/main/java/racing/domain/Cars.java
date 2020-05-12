package racing.domain;

import racing.util.NumberGenerator;
import racing.util.RandomDistanceUtil;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public RacingResult operate(int tryCount, NumberGenerator numberGenerator) {
        List<Car> racingResult = new ArrayList<>();
        for (int curTryCount = 0; curTryCount < tryCount; curTryCount++) {
            moveCars(racingResult, numberGenerator);
        }

        return new RacingResult(racingResult);
    }

    private Car get(int idx) {
        return cars.get(idx);
    }

    private int size() {
        return cars.size();
    }

    private void moveCars(List<Car> racingResult, NumberGenerator numberGenerator) {
        for (int carIdx = 0; carIdx < size(); carIdx++) {
            Car car = get(carIdx);
            car.move(RandomDistanceUtil.getRandomDistance(numberGenerator));
            racingResult.add(new Car(car.getName(), car.getDistance()));
        }
    }
}
