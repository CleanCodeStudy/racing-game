package racing.vo;

import java.util.List;

public class RacingCarsOfPerRound {
    private List<CarOfPerRound> carOfPerRounds;

    public RacingCarsOfPerRound(List<CarOfPerRound> carOfPerRounds) {
        this.carOfPerRounds = carOfPerRounds;
    }

    public List<CarOfPerRound> getCarOfPerRounds() {
        return carOfPerRounds;
    }
}
