package racing;

import racing.domain.RacingCar;
import racing.input.InputValue;
import racing.input.Validator;
import racing.view.InputView;
import racing.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private int totalRound;
    private int currentRound = 0;
    private List<RacingCar> racingCarList;

    public void run() {
        initRacingGame();
        OutputView.initOutputView(totalRound);
        for (int i = 0; i < totalRound; i++) {
            playNextRound();
        }
    }

    private void initRacingGame() {
        totalRound = InputValue.getRoundCount();
        racingCarList = new ArrayList<>();
        for (int i = 0; i < InputValue.getRacingCarCounts(); i++) {
            racingCarList.add(new RacingCar());
        }
    }

    private void playNextRound() {
        int remainRound = totalRound - currentRound;
        Validator.isNotExistRound(remainRound);
        for (RacingCar racingCar : racingCarList) {
            racingCar.attendRound();
        }

        OutputView.getRoundViews()
                .get(currentRound)
                .initRoundView(getRoundResult());

        currentRound++;
    }

    private StringBuilder getRoundResult() {
        StringBuilder roundResult = new StringBuilder();
        for (RacingCar racingCar : racingCarList) {
            roundResult.append(racingCar.getPosition());
            roundResult.append("\n");
        }
        return roundResult;
    }
}
