package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racing.domain.common.FixedNumberGenerator;

import static org.assertj.core.api.Assertions.assertThat;

class RacingPhaseTest {
    @DisplayName("startRace는 이동 시도 결과를 가지고 있는 RacingResult를 반환한다.")
    @ParameterizedTest
    @ValueSource(ints = {3, 4})
    void name(int numberOfCars) {
        RacingPhase racingPhase = new RacingPhase(numberOfCars);
        RacingResult result = racingPhase.startRace(new FixedNumberGenerator());

        assertThat(result.getRaceResults().size()).isEqualTo(numberOfCars);
    }
}