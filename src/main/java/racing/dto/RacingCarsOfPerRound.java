package racing.dto;

import racing.domain.RacingCars;

import java.util.List;
import java.util.stream.Collectors;

public class RacingCarsOfPerRound {
    private Integer round;
    private List<CarOfPerRound> carOfPerRounds;

    public RacingCarsOfPerRound(Integer round, RacingCars racingCars) {
        this.round = round;
        this.carOfPerRounds = racingCars.getCars().stream()
                .map(CarOfPerRound::new)
                .collect(Collectors.toList());
    }

    public List<CarOfPerRound> getCarOfPerRounds() {
        return carOfPerRounds;
    }
}
