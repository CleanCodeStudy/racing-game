package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.domain.common.FixedNumberGenerator;

import static org.assertj.core.api.Assertions.assertThat;

class RacingPhaseTest {
    @DisplayName("startRace는 이동 시도 결과를 가지고 있는 PhaseResult를 반환한다.")
    @Test
    void name() {
        RacingPhase racingPhase = new RacingPhase(new String[]{"pobi", "crong"});
        PhaseResult result = racingPhase.startRace(new FixedNumberGenerator());

        assertThat(result.getRaceResults().size()).isEqualTo(2);
    }
}