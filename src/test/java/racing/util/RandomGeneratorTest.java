package racing.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class RandomGeneratorTest {

    @DisplayName("항상 10이하의 랜덤숫자가 나온다")
    @Test
    void random() {
        assertThat(RandomGenerator.pickRandomNumber()).isLessThanOrEqualTo(10);
    }

}
