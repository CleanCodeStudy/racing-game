package racing.util;

import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator {
    private final int MAX = 10;

    @Override
    public int generateNumber() {
        return new Random().nextInt(MAX);
    }
}
