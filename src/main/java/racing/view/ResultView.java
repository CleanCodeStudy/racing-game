package racing.view;

import racing.domain.Car;
import racing.domain.Cars;

public class ResultView {
    private final String OPERATE_RESULT = "실행 결과";
    private final String DISTANCE = "-";
    private final String ENTER = "\n";

    public ResultView() {
        printEmpty();
        System.out.println(OPERATE_RESULT);
    }

    public void printResult(Cars cars) {
        for (int idx = 0; idx < cars.getSize(); idx++) {
            printDistance(cars.getCar(idx));
        }
        printEmpty();
    }

    private void printDistance(Car car) {
        int distance = car.getDistance();
        while (remainDistance(distance--)) {
            System.out.print(DISTANCE);
        }
        printEmpty();
    }

    private boolean remainDistance(int distance) {
        return distance > 0;
    }

    private void printEmpty() {
        System.out.print(ENTER);
    }
}
