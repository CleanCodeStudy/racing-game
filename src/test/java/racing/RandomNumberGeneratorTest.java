package racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {
    @DisplayName("0~9사이의 임의의 수를 반환한다.")
    @Test
    void name() {
        NumberGenerator generator = new RandomNumberGenerator();
        List<Integer> number = generator.generateNumber(1);
        assertThat(number.get(0)).isBetween(0, 9);
    }
}