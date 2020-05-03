package racing.dto;

import racing.vo.RacingCarsSnapshot;

import java.util.ArrayList;
import java.util.List;

public class RacingGameResult {
    private final int totalGameRound;
    private final List<RacingCarsSnapshot> racingCarsSnapshots = new ArrayList<>();

    public RacingGameResult(final RacingGameInfo racingGameInfo) {
        this.totalGameRound = racingGameInfo.getCountOfMovement();
    }

    public void record(RacingCarsSnapshot racingCarsSnapshot) {
        if (disableRecord()) {
            throw new IllegalArgumentException(String.format("%d경기 이상 기록할 수 없습니다.", totalGameRound));
        }
        racingCarsSnapshots.add(racingCarsSnapshot);
    }

    private boolean disableRecord() {
        return racingCarsSnapshots.size() >= totalGameRound;
    }

    public List<RacingCarsSnapshot> getRacingCarsSnapshots() {
        return racingCarsSnapshots;
    }
}
