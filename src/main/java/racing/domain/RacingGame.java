package racing.domain;

import racing.domain.common.NumberGenerator;
import racing.dto.InputValueDto;

public class RacingGame {
    private final RacingPhase racingPhase;
    private final InputValueDto inputValueDto;

    public RacingGame(InputValueDto inputValueDto) {
        this.inputValueDto = inputValueDto;
        this.racingPhase = new RacingPhase(inputValueDto.getNumberOfCars());
    }

    public GameResult startGame(NumberGenerator numberGenerator) {
        int numberOfAttempts = inputValueDto.getNumberOfAttempts();
        GameResult gameResult = new GameResult(numberOfAttempts);

        for (int i = 0; i < numberOfAttempts; i++) {
            RacingResult eachRacingResult = racingPhase.startRace(numberGenerator);
            gameResult.addEachRacingResult(eachRacingResult);
        }

        return gameResult;
    }
}
