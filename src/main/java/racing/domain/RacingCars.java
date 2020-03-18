package racing.domain;

import java.util.List;

public class RacingCars {

    private final List<Car> racingCars;

    public RacingCars(List<Car> racingCars) {
        this.racingCars = racingCars;
    }

    public void runUpto(final int numberOfMovement) {
        for (Car car : racingCars) {
            car.runUpto(numberOfMovement);
        }
    }

    public String createTrack() {
        StringBuilder tracks = new StringBuilder();
        for (Car car : racingCars) {
            tracks.append(car.createTrack());
            tracks.append("\n");
        }
        return tracks.toString();
    }

    public int size() {
        return racingCars.size();
    }

}
