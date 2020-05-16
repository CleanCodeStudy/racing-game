package racing.domain;

public final class CarData {
    private final String name;
    private final int distance;

    public CarData(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}
