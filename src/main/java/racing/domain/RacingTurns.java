package racing.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingTurns {

    private List<RacingTurn> racingTurns;

    public RacingTurns(List<RacingTurn> racingTurns) {
        this.racingTurns = racingTurns;
    }

    public List<RacingTurn> get() {
        return new ArrayList<>(racingTurns);
    }

    public RacingTurn getLastTurn() {
        int lastTurnIndex = racingTurns.size() - 1;
        return racingTurns.get(lastTurnIndex);
    }
}
