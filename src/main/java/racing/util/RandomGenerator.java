package racing.util;

import java.util.Random;

public class RandomGenerator {

    private static final int LIMIT = 10;
    private static final Random RANDOM = new Random();

    public static int pickRandomNumber() {
        return RANDOM.nextInt(LIMIT);
    }
}
