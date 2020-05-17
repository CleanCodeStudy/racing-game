package racing.domain;

import java.util.*;
import java.util.stream.Collectors;

public class EachRoundResult {
    private final Map<Integer, List<ResultCarInfo>> eachRoundResult = new HashMap<>();

    public void addRoundResult(int roundIdx, List<ResultCarInfo> resultCarInfos) {
        eachRoundResult.put(roundIdx, resultCarInfos);
    }

    public List<ResultCarInfo> getRoundResult(int roundIdx) {
        return eachRoundResult.get(roundIdx);
    }

    public List<String> getWinners() {
        List<ResultCarInfo> lastRound = getLastRound();
        int maxDistance = getMaxDistance(lastRound);
        return lastRound.stream()
                .filter(carDataInfo -> carDataInfo.getDistance() == maxDistance)
                .map(ResultCarInfo::getName)
                .collect(Collectors.toList());
    }

    private List<ResultCarInfo> getLastRound() {
        return eachRoundResult.get(eachRoundResult.size());
    }

    private int getMaxDistance(List<ResultCarInfo> lastRound) {
        ResultCarInfo maxByDistance = lastRound.stream()
                .max(Comparator.comparing(ResultCarInfo::getDistance))
                .orElseThrow((NoSuchElementException::new));

        return maxByDistance.getDistance();
    }

    public int size() {
        return eachRoundResult.size();
    }
}
