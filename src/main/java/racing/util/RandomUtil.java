package racing.util;

import java.util.Random;

public class RandomUtil{
    private static final int MAX = 10;
    private static final int MIN = 4;
    private static final int STOP = 0;
    private static final Random random = new Random();

    public static int getRandomDistance() {
        int randomDistance = random.nextInt(MAX);
        if (lessThanMin(randomDistance)) {
            return STOP;
        }

        return randomDistance;
    }

    private static boolean lessThanMin(int randomDistance) {
        return randomDistance < MIN;
    }
}
