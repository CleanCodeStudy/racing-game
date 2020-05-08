package racing.domain;

import racing.util.NumberGenerator;

public class FixedNumberGenerator implements NumberGenerator {
    int number;

    public FixedNumberGenerator(int number) {
        this.number = number;
    }

    @Override
    public int generateNumber() {
        return this.number;
    }
}
