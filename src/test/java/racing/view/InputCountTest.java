package racing.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InputCountTest {

    @DisplayName("입력 값이 양수가 아니면 예외발생을 시킨다.")
    @ParameterizedTest
    @ValueSource(ints = {-1, 0})
    void checkPositive2(int count) {
        assertThatThrownBy(() -> {
            new InputCount(count);
        }).isInstanceOf(IllegalArgumentException.class).hasMessage("입력하신 값이 양수가 아닙니다.");
    }
}
