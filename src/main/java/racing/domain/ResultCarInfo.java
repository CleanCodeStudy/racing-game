package racing.domain;

public final class ResultCarInfo {
    private final String name;
    private final int distance;

    public ResultCarInfo(String name, int distance) {
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
