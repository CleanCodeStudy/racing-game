package racing.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class RacingTurns {

    private List<RacingTurn> racingTurns;

    public RacingTurns(List<RacingTurn> racingTurns) {
        verifyRacingTurnsNotEmpty(racingTurns);
        this.racingTurns = racingTurns;
    }

    public List<RacingTurn> get() {
        return new ArrayList<>(racingTurns);
    }

    public int getMaxDistance() {
        return getLastTurn()
                .getCarDistances()
                .stream()
                .max(Comparator.naturalOrder())
                .orElseThrow(IllegalStateException::new);
    }

    public List<Integer> getLastTurnCarDistances() {
        return getLastTurn().getCarDistances();
    }

    private RacingTurn getLastTurn() {
        int lastTurnIndex = racingTurns.size() - 1;
        return racingTurns.get(lastTurnIndex);
    }

    private void verifyRacingTurnsNotEmpty(List<RacingTurn> racingTurns) {
        if (racingTurns.isEmpty()) {
            throw new IllegalStateException("RacingTurn의 개수는 0개일 수 없음.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RacingTurns that = (RacingTurns) o;
        return Objects.equals(racingTurns, that.racingTurns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(racingTurns);
    }
}
