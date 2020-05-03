package racing.domain;

import racing.util.NumberGenerator;
import racing.util.RandomUtil;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public RacingResult operate(int tryCount, NumberGenerator numberGenerator) {
        List<Integer> racingResult = new ArrayList<>();
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

    private void moveCars(List<Integer> racingResult, NumberGenerator numberGenerator) {
        for (int carIdx = 0; carIdx < size(); carIdx++) {
            Car car = get(carIdx);
            car.move(RandomUtil.getRandomDistance(numberGenerator));
            racingResult.add(car.getDistance());
        }
    }
}
