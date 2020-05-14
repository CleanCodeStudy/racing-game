package racing.domain.common;

import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator {
    private static final int RACING_NUMBER_BOUND = 10;

    @Override
    public int generateNumber() {
        return new Random().nextInt(RACING_NUMBER_BOUND);
    }

}
