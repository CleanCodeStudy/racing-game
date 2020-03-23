package racing.dto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;


class InputValueDtoTest {
    private static final String CAR_EXCEPTION_MESSAGE = "참여할 자동차의 대수는 0 보다 커야합니다.";
    private static final String ATTEMPT_EXCEPTION_MESSAGE = "시도할 횟수는 0 보다 커야합니다.";

    @DisplayName("0 이하 값은 IllegalArgumentException을 던진다")
    @ParameterizedTest
    @CsvSource({"0,1," + CAR_EXCEPTION_MESSAGE,
            "1,-1," + ATTEMPT_EXCEPTION_MESSAGE})
    void name(int numberOfCars, int numberOfAttempts, String message) {
        assertThatThrownBy(() -> new InputValueDto(numberOfCars, numberOfAttempts))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(message);
    }
}