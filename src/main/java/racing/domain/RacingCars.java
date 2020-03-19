package racing.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {

    private final List<Car> racingCars;

    public RacingCars(final int numberOfCar) {
        List<Car> cars = new ArrayList<>(numberOfCar);
        for (int i = 0; i < numberOfCar; i++) {
            cars.add(new Car());
        }
        this.racingCars = cars;
    }

    public void runUpTo(final int numberOfMovement) {
        for (Car car : racingCars) {
            car.runUpTo(numberOfMovement);
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
