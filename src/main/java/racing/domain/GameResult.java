package racing.domain;

import java.util.ArrayList;
import java.util.List;


public class GameResult {
    private final List<RacingResult> racingResults;
    private int numberOfPhase;

    public GameResult() {
        this.racingResults = new ArrayList<>();
    }

    public GameResult(int numberOfPhase) {
        this.racingResults = new ArrayList<>();
        this.numberOfPhase = numberOfPhase;
    }

    public void addEachRacingResult(RacingResult racingResult) {
        this.racingResults.add(racingResult);
    }

    public RacingResult findRacingResultByPhase(int phase) {
        return racingResults.get(phase - 1);
    }

    public int getNumberOfPhase() {
        return numberOfPhase;
    }
}
