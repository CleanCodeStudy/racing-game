package racing.vo;

import racing.domain.Car;

public class CarOfPerRound {
    private final String name;
    private final int location;

    public CarOfPerRound(Car car) {
        this.name = car.getName();
        this.location = car.getLocation();
    }

    public int getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}
