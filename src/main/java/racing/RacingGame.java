package racing;

import racing.domain.*;
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

        Cars cars = new Cars(CarFactory.createCars(carNames));

        EachRoundResult eachRoundResult = new EachRoundResult();
        cars.operate(tryCount, new RandomNumberGenerator(), eachRoundResult);

        Winners winners = new Winners(eachRoundResult.getWinners());

        ResultView resultView = new ResultView();
        resultView.printResult(eachRoundResult, winners);
    }
}
