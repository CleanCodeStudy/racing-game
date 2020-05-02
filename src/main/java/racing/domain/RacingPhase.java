package racing.domain;

import racing.domain.common.NumberGenerator;

public class RacingPhase {
    private final ParticipateCars participateCars;

    public RacingPhase(String[] namesOfCars) {
        this.participateCars = new ParticipateCars(namesOfCars);
    }

    public PhaseResult startRace(NumberGenerator numberGenerator) {
        return new PhaseResult(participateCars.tryMoveWithName(numberGenerator));
    }
}
