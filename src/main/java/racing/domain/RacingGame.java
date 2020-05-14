package racing.domain;

import racing.domain.car.ParticipateCars;
import racing.domain.common.NumberGenerator;

public class RacingGame {
    private final ParticipateCars participateCars;
    private final GameInformation gameInformation;

    public RacingGame(GameInformation gameInformation) {
        this.gameInformation = gameInformation;
        this.participateCars = new ParticipateCars(gameInformation.getNamesOfCars());
    }

    public GameResult startGame(NumberGenerator numberGenerator) {
        int numberOfAttempts = gameInformation.getNumberOfAttempts();
        GameResult gameResult = new GameResult(numberOfAttempts);

        for (int i = 0; i < numberOfAttempts; i++) {
            PhaseResult phaseResult = new PhaseResult(participateCars.moveCars(numberGenerator));
            gameResult.addEachRacingResult(phaseResult);
        }

        return gameResult;
    }
}
