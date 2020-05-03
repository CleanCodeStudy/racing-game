package racing.vo;

import java.util.Objects;

public class CarSnapshot {
    private final String name;
    private final int location;

    public CarSnapshot(String name, int location) {
        this.name = name;
        this.location = location;
    }

    public int getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CarOfPerRound{" +
                "name='" + name + '\'' +
                ", location=" + location +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarSnapshot that = (CarSnapshot) o;
        return location == that.location &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location);
    }
}
