package racing.domain;

import java.util.*;
import java.util.stream.Collectors;

public class RacingResult {
    private final List<CarData> racingResult;

    public RacingResult(List<CarData> racingResult) {
        this.racingResult = racingResult;
    }

    public int size() {
        return racingResult.size();
    }

    public CarData get(int idx) {
        return racingResult.get(idx);
    }

    public List<String> getWinners() {
        int maxDistance = getMaxDistance();
        return racingResult
                .stream()
                .filter(carData -> (carData.getDistance() == maxDistance))
                .map(carData -> carData.getName())
                .distinct()
                .collect(Collectors.toList());
    }

    private int getMaxDistance() {
        CarData maxByDistance = racingResult
                .stream()
                .max(Comparator.comparing(CarData::getDistance))
                .orElseThrow(NoSuchElementException::new);

        return maxByDistance.getDistance();
    }
}
