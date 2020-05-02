package racing.domain;

import java.util.ArrayList;
import java.util.List;


public class GameResult {
    private final List<PhaseResult> phaseResults;
    private int numberOfPhase;

    public GameResult(int numberOfPhase) {
        this.phaseResults = new ArrayList<>();
        this.numberOfPhase = numberOfPhase;
    }

    public void addEachRacingResult(PhaseResult phaseResult) {
        this.phaseResults.add(phaseResult);
    }

    public PhaseResult findRacingResultByPhase(int phase) {
        try {
            return phaseResults.get(phase - 1);
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException(String.format("존재하지 않는 시도 횟수입니다. - %d \n", phase));
        }
    }

    public int getNumberOfPhase() {
        return numberOfPhase;
    }

    public List<String> getWinner() {
        PhaseResult lastResult = findRacingResultByPhase(numberOfPhase);

        return lastResult.getCurrentLeads();
    }
}
