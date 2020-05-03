package racing.domain;

public class Car {
    private int distance;

    public Car(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void move(int distance) {
        this.distance += distance;
    }
}
