package racing.domain;

import java.util.List;

public class RacingResult {
    private final List<Integer> raceResults;

    public RacingResult(List<Integer> raceResults) {
        this.raceResults = raceResults;
    }

    public List<Integer> getRaceResults() {
        return raceResults;
    }
}
