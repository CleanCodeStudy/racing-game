package racing.domain;

import racing.domain.common.NumberGenerator;

public class RacingPhase {
    private final ParticipateCars participateCars;

    public RacingPhase(int numberOfCars) {
        this.participateCars = new ParticipateCars(numberOfCars);
    }

    public RacingResult startRace(NumberGenerator numberGenerator) {
        return new RacingResult(participateCars.tryMove(numberGenerator));
    }


}
