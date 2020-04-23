package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RacingTurnTest {

    @DisplayName("일급 객체 생성 테스트")
    @Test
    void racingResult() {
        // given
        RacingTurn racingTurn = new RacingTurn(Arrays.asList(1, 2, 3));

        // then
        assertThat(racingTurn.getRacingResult()).isEqualTo((Arrays.asList(1, 2, 3)));
        // 지금은 .getRacingResult() 를 테스트를 하는거지 일급객체테스트를 하는건 아ㅣㄴㅁ.
        // 테스트 이름을 바꾸던지 아니면 냉ㅇ을 바구던지
    }
}