package racing.dto;

import racing.domain.RacingCars;

import java.util.ArrayList;
import java.util.List;

public class RacingGameResult {
    private List<RacingCars> racingCarsPerRound = new ArrayList<>();

    public RacingGameResult record(RacingCars racingCars) {
        racingCarsPerRound.add(new RacingCars(racingCars));
        return this;
    }

    public List<RacingCars> getRacingCarsPerRound() {
        return racingCarsPerRound;
    }
}
