package racing.domain;

import racing.view.ResultView;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(int carCount) {
        this.cars = collectCars(carCount);
    }

    public void operate(int tryCount) {
        ResultView resultView = new ResultView();
        while (remainTryCount(tryCount--)) {
            moveCars();
            resultView.printResult(this);
        }
    }

    public Car getCar(int idx) {
        return cars.get(idx);
    }

    public int getSize() {
        return cars.size();
    }

    private List<Car> collectCars(int carCount) {
        List<Car> cars = new ArrayList<>();
        while (remainCar(carCount--)) {
            cars.add(new Car(0));
        }

        return cars;
    }

    private boolean remainCar(int carCount) {
        return carCount > 0;
    }

    private boolean remainTryCount(int tryCount) {
        return tryCount > 0;
    }

    private void moveCars() {
        for (int idx = 0; idx < getSize(); idx++) {
            Car car = getCar(idx);
            car.move();
        }
    }
}
