package racing;

import racing.domain.CarFactory;
import racing.domain.RacingResult;
import racing.domain.Cars;
import racing.view.InputView;
import racing.view.ResultView;

import java.util.Scanner;

public class RacingGame {
    private final InputView inputView = new InputView(new Scanner(System.in));

    public void run() {
        int carCount = inputView.inputCarCount();
        int tryCount = inputView.inputTryCount();

        Cars cars = new Cars(CarFactory.createCar(carCount));
        RacingResult racingResult = cars.operate(tryCount);
        ResultView resultView = new ResultView();
        resultView.printResult(racingResult, carCount);
    }
}
