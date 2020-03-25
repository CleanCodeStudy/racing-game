package racing.domain;

import java.util.List;

public class RacingTurn {

    private final List<Integer> racingResult;

    public RacingTurn(List<Integer> racingResult) {
        this.racingResult = racingResult;
    }

    public List<Integer> getRacingResult() {
        return racingResult;
    }
}
