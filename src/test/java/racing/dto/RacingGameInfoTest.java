package racing.dto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RacingGameInfoTest {

    @DisplayName("숫자가 아닌 값이나 0이하의 수를 입력받으면 익셉션을 던진다")
    @CsvSource({"한글, 한글", "한글, 123", "123, 한글", "0, 0", "-1,0"})
    @ParameterizedTest
    void throwException(String numberOfCars, String countOfMovement) {
        assertThatThrownBy(() -> new RacingGameInfo(numberOfCars, countOfMovement))
                .isInstanceOf(IllegalArgumentException.class);
    }

}
