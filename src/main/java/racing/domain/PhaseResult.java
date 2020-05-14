package racing.domain;

import racing.domain.car.CarResult;

import java.util.List;
import java.util.stream.Collectors;

public class PhaseResult {
    private final List<CarResult> raceResults;

    public PhaseResult(List<CarResult> raceResults) {
        this.raceResults = raceResults;
    }

    public List<CarResult> getRaceResults() {
        return raceResults;
    }

    public List<String> getCurrentLeads() {
        CarResult currentLead = raceResults.stream()
                .sorted()
                .findFirst()
                .orElseThrow(IllegalAccessError::new);

        return raceResults.stream()
                .filter(carResult -> carResult.getDistance() == currentLead.getDistance())
                .map(CarResult::getName)
                .collect(Collectors.toList());
    }
}
