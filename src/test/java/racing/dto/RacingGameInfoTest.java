package racing.dto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class RacingGameInfoTest {

    @DisplayName("자동차 대수 또는 이동횟수에 0 이하의 값이 들어가면 익셉션을 던진다")
    @CsvSource({"0, 0", "0, 2", "2, 0", "-1,2", "2 , -1"})
    @ParameterizedTest
    void racingGameDtoValid(int numberOfCar, int numberOfMovement) {
        assertThatThrownBy(() -> new RacingGameInfo(numberOfCar, numberOfMovement))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차 대수와 이동횟수는 0 이하의 값을 가질 수 없습니다");
    }

}
