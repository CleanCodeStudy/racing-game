package racing.dto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;


class GameInformationTest {
    private static final String CAR_EXCEPTION_MESSAGE = "참여할 자동차의 대수는 0 보다 커야합니다.";
    private static final String CAR_NAME_EXCEPTION_MESSAGE = "입력된 자동차 이름의 개수는 0 보다 커야합니다.";
    private static final String ATTEMPT_EXCEPTION_MESSAGE = "시도할 횟수는 0 보다 커야합니다.";

    @DisplayName("시도 회수가 0 이하면 IllegalArgumentException을 던진다")
    @Test
    void name2() {
        assertThatThrownBy(() -> new GameInformation(new String[]{"pobi"}, 0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ATTEMPT_EXCEPTION_MESSAGE);
    }
}