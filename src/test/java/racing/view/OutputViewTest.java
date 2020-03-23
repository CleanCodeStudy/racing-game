package racing.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class OutputViewTest {

    @DisplayName("인자로 받은 값 만큼 - 를 만들어 반환한다.")
    @ParameterizedTest
    @CsvSource({"3,---",
            "4,----",
            "1,-"})
    void visualize(int target, String expectedResult) {
        assertThat(OutputView.visualize(target)).isEqualTo(expectedResult);
    }
}