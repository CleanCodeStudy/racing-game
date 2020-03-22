package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator {
    private static final int RACING_NUMBER_BOUND = 10;

    @Override
    public List<Integer> generateNumber(int numberOfAttempts) {
        List<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < numberOfAttempts; i++) {
            randomNumbers.add(new Random().nextInt(RACING_NUMBER_BOUND));
        }

        return randomNumbers;
    }

    @Override
    public int generateNumber() {
        return new Random().nextInt(RACING_NUMBER_BOUND);
    }

}
