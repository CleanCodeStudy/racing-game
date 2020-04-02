package racing.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingField {
    private final int totalTurns;
    private final RacingCars racingCars;

    public RacingField(int totalTurns, RacingCars racingCars) {
        this.totalTurns = totalTurns;
        this.racingCars = racingCars;
    }

    public List<RacingTurn> race() {
        List<RacingTurn> racingTurns = new ArrayList<>();
        for (int turn = 0; turn < totalTurns; turn++) {
            racingCars.move();
            RacingTurn racingTurn = new RacingTurn(racingCars.getDistances());
            racingTurns.add(racingTurn);
        }
        return racingTurns;
    }

}
