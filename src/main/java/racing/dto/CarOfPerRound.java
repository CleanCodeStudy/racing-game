package racing.dto;

import racing.domain.Car;

public class CarOfPerRound {
    private final int location;

    public CarOfPerRound(Car car) {
        this.location = car.getLocation();
    }

    public int getLocation() {
        return location;
    }
}
