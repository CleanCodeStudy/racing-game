package racing.util;

public class RandomUtil {
    private static final int MOVE = 1;
    private static final int STOP = 0;

    public static int getRandomDistance(NumberGenerator numberGenerator) {
        if (numberGenerator.generateNumber() >= 4) {
            return MOVE;
        }
        return STOP;
    }
}
