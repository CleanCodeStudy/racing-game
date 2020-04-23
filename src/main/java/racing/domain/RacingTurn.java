package racing.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RacingTurn {

    private final List<Integer> racingResult;

    public RacingTurn(List<Integer> racingResult) {
        this.racingResult = racingResult;
    }

    public List<Integer> getRacingResult() {
        return new ArrayList<>(racingResult);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RacingTurn that = (RacingTurn) o;
        return Objects.equals(racingResult, that.racingResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(racingResult);
    }
}
