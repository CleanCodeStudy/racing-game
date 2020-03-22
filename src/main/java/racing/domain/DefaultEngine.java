package racing.domain;

import racing.util.RandomGenerator;

public class DefaultEngine implements Engine {
    @Override
    public int getPower() {
        return RandomGenerator.pickRandomNumber();
    }
}
