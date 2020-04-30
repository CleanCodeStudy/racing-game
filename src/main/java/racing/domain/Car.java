package racing.domain;

import racing.util.RandomUtil;

public class Car {
    private int distance;

    public Car(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void move() {
        this.distance += RandomUtil.getRandomDistance();
    }
}
