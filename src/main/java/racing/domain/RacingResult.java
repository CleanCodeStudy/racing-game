package racing.domain;

import java.util.List;

public class RacingResult {
    private final List<Integer> racingResult;

    public RacingResult(List<Integer> racingResult) {
        this.racingResult = racingResult;
    }

    public int size() {
        return racingResult.size();
    }

    public int get(int idx) {
        return racingResult.get(idx);
    }
}
