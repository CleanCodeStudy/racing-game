package racing.domain.common;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomNumberGeneratorTest {
    @DisplayName("0~9사이의 임의의 수를 반환한다.")
    @Test
    void name() {
        NumberGenerator generator = new RandomNumberGenerator();
        int number = generator.generateNumber();
        assertThat(number).isBetween(0, 9);
    }
}