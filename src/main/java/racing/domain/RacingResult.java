package racing.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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
        int maxDistance = getMaxDistance();
        List<Integer> lastTurnCarDistances = racingTurns.getLastTurn().getCarDistances();
        return IntStream.range(0, carNames.size())
                .boxed()
                .filter(i -> lastTurnCarDistances.get(i) == maxDistance)
                .map(i -> carNames.get(i))
                .collect(Collectors.toList());
    }

    private int getMaxDistance() {
        return racingTurns.getLastTurn()
                .getCarDistances()
                .stream()
                .max(Comparator.naturalOrder())
                .orElseThrow(IllegalStateException::new);
    }

}
