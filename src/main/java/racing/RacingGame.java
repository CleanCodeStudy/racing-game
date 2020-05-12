package racing;

import racing.domain.CarFactory;
import racing.domain.RacingResult;
import racing.domain.Cars;
import racing.util.RandomNumberGenerator;
import racing.view.InputView;
import racing.view.ResultView;

import java.util.List;
import java.util.Scanner;

public class RacingGame {
    private final InputView inputView = new InputView(new Scanner(System.in));

    public void run() {
        List<String> carNames = inputView.inputCarNames();
        int tryCount = inputView.inputTryCount();

        Cars cars = new Cars(CarFactory.createCar(carNames));
        RacingResult racingResult = cars.operate(tryCount, new RandomNumberGenerator());

        ResultView resultView = new ResultView();
        resultView.printResult(racingResult, carNames.size());
    }
}
