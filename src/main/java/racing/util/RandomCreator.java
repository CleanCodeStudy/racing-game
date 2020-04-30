package racing.util;

import java.util.Random;

public class RandomCreator {

    private static int randomValue;
    private static final int MAX = 10;

    private static void createRandomValue() {
        Random random = new Random();
        randomValue = random.nextInt(MAX);
    }

    public static int getRandomValue() {
        createRandomValue();
        return randomValue;
    }
}
