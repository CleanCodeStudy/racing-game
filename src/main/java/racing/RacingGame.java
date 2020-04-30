package racing;

import racing.domain.Cars;
import racing.view.InputView;

import java.util.Scanner;

public class RacingGame {
    private final InputView inputView = new InputView(new Scanner(System.in));

    public void run() {
        int carCount = inputView.inputCarCount();
        int tryCount = inputView.inputTryCount();

        Cars cars = new Cars(carCount);
        cars.operate(tryCount);
    }
}
