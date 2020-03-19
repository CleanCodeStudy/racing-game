package racing.view;

import java.util.List;

public class RacingResult {

    private final List<List<Integer>> racingTurns;

    public RacingResult(List<List<Integer>> racingTurns) {
        this.racingTurns = racingTurns;
    }

    public List<List<Integer>> getRacingTurns() {
        return racingTurns;
    }
}
