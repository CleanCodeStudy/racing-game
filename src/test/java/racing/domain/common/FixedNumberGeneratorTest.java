package racing.domain.common;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class FixedNumberGeneratorTest {

    @DisplayName("generateNumber를 호출 할 때마다 4와 3이 번갈아가며 반환된다.")
    @Test
    void name() {
        NumberGenerator fixedNumberGenerator = new FixedNumberGenerator();
        assertAll(
                () -> assertThat(fixedNumberGenerator.generateNumber()).isEqualTo(4),
                () -> assertThat(fixedNumberGenerator.generateNumber()).isEqualTo(3),
                () -> assertThat(fixedNumberGenerator.generateNumber()).isEqualTo(4)
        );
    }
}