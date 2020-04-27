package racing.dto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RacingGameInfoTest {

    @DisplayName("이동 횟수에 숫자가 아닌 값을 받으면 익셉션을 던진다")
    @CsvSource({"abc, 한글", "123, 한글"})
    @ParameterizedTest
    void throwException(String carNames, String countOfMovement) {
        assertThatThrownBy(() -> new RacingGameInfo(carNames, countOfMovement))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Integer 값만 들어올 수 있습니다");
    }

    @DisplayName("경기하는 자동차이름 입력이 1개 이하거나, 이동횟수가 0이하이면 익셉션을 던진다")
    @CsvSource({"'',-1", "a,0", "a,1", "'a,b',-1", "'a,b', 0"})
    @ParameterizedTest
    void invalidInputException(String carGroups, String countOfMovement) {
        assertThatThrownBy(() -> new RacingGameInfo(carGroups, countOfMovement))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("올바른 입력값이 아닙니다");

    }

}
