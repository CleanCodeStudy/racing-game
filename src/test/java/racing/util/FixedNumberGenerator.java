package racing.util;

public class FixedNumberGenerator implements NumberGenerator {
    private int distance;

    public FixedNumberGenerator(int distance) {
        this.distance = distance;
    }

    @Override
    public int generateNumber() {
        return this.distance;
    }
}
