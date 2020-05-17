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

    public void operate(int tryCount, NumberGenerator numberGenerator, EachRoundResult eachRoundResult) {
        for (int roundIdx = 1; roundIdx <= tryCount; roundIdx++) {
            List<ResultCarInfo> roundResult = new ArrayList<>();
            moveCars(roundResult, numberGenerator);
            eachRoundResult.addRoundResult(roundIdx, roundResult);
        }
    }

    private void moveCars(List<ResultCarInfo> roundResult, NumberGenerator numberGenerator) {
        for (int carIdx = 0; carIdx < cars.size(); carIdx++) {
            Car car = cars.get(carIdx);
            car.move(RandomDistanceUtil.getRandomDistance(numberGenerator));
            roundResult.add(new ResultCarInfo(car.getName(), car.getDistance()));
        }
    }
}
