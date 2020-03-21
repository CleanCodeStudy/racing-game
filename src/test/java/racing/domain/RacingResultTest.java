package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RacingResultTest {

    @DisplayName("객체 생성 테스트")
    @Test
    void racingResult() {
        // given
        List<List<Integer>> racingTurns = Arrays.asList(Arrays.asList(1, 2, 3));

        // then
        assertThat(racingTurns).isEqualTo(Arrays.asList(Arrays.asList(1, 2, 3)));
    }
}