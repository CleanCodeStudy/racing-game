package racing.dto;

import racing.vo.RacingCarsOfPerRound;

import java.util.ArrayList;
import java.util.List;

public class RacingGameResult {
    private List<RacingCarsOfPerRound> racingCarsPerRound = new ArrayList<>();

    public void record(RacingCarsOfPerRound racingCarsOfPerRound) {
        racingCarsPerRound.add(racingCarsOfPerRound);
    }

    public List<RacingCarsOfPerRound> getRacingCarsPerRound() {
        return racingCarsPerRound;
    }

    public int totalGameRound() {
        return racingCarsPerRound.size();
    }
}
