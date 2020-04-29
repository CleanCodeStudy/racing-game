package racing.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RacingResult {
    private List<String> carNames;
    private List<String> winners;
    private RacingTurns racingTurns;

    public RacingResult(RacingTurns racingTurns, List<String> carNames) {
        this.racingTurns = racingTurns;
        this.carNames = carNames;
        this.winners = findWinners();
    }

    public List<String> getCarNames() {
        return new ArrayList<>(carNames);
    }

    public List<String> getWinners() {
        return new ArrayList<>(winners);
    }

    public RacingTurns getRacingTurns() {
        return racingTurns;
    }

    private List<String> findWinners() {
        int maxDistance = racingTurns.getMaxDistance();
        List<Integer> lastTurnCarDistances = racingTurns.getLastTurnCarDistances();
        return IntStream.range(0, carNames.size())
                .boxed()
                .filter(i -> lastTurnCarDistances.get(i) == maxDistance)
                .map(i -> carNames.get(i))
                .collect(Collectors.toList());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RacingResult that = (RacingResult) o;
        return Objects.equals(carNames, that.carNames) &&
                Objects.equals(winners, that.winners) &&
                Objects.equals(racingTurns, that.racingTurns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carNames, winners, racingTurns);
    }
}
