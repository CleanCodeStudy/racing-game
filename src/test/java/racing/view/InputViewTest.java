package racing.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayInputStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class InputViewTest {

    @DisplayName("자동차 대수에 숫자가 들어오지 않으면 Exception")
    @CsvSource({"abc", "가나다", "1기"})
    @ParameterizedTest
    void askNumberOfCar(String condition) {
        System.setIn(new ByteArrayInputStream(condition.getBytes()));

        assertThatThrownBy(InputView::askNumberOfCar)
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("이동횟수에 숫자가 들어오지 않으면 Exception")
    @CsvSource({"abc", "가나다", "1기"})
    @ParameterizedTest
    void askNumberOfMovement(String condition) {
        System.setIn(new ByteArrayInputStream(condition.getBytes()));

        assertThatThrownBy(InputView::askCountOfMovement)
                .isInstanceOf(IllegalArgumentException.class);
    }
}
