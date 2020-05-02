package racing.domain;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class PhaseResult {
    private final Map<String, Integer> raceResults;

    public PhaseResult(Map<String, Integer> raceResults) {
        this.raceResults = raceResults;
    }

    public Map<String, Integer> getRaceResults() {
        return raceResults;
    }

    public List<String> getCurrentLeads() {
        int max = raceResults.entrySet().stream()
                .mapToInt(Map.Entry::getValue)
                .max()
                .orElseThrow(IllegalStateException::new);

        return raceResults.entrySet().stream()
                .filter(x -> x.getValue() == max)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
