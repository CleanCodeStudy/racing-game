package racing.vo;

import java.util.List;
import java.util.Objects;

public class RacingCarsSnapshot {
    private final int round;
    private final List<CarSnapshot> carSnapshots;

    public RacingCarsSnapshot(final int round, List<CarSnapshot> carSnapshots) {
        this.round = round;
        this.carSnapshots = carSnapshots;
    }

    public List<CarSnapshot> getCarSnapshots() {
        return carSnapshots;
    }

    @Override
    public String toString() {
        return "RacingCarsOfPerRound{" +
                "round=" + round +
                ", carOfPerRounds=" + carSnapshots +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RacingCarsSnapshot that = (RacingCarsSnapshot) o;
        return round == that.round &&
                Objects.equals(carSnapshots, that.carSnapshots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(round, carSnapshots);
    }
}
