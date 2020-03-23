package racing.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racing.domain.common.FixedNumberGenerator;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RacingGameServiceTest {
    @DisplayName("startRace는 이동 시도 결과를 가지고 있는 정수형 List를 반환한다.")
    @ParameterizedTest
    @ValueSource(ints = {3, 4})
    void name(int numberOfCars) {
        RacingGameService racingGameService = new RacingGameService(numberOfCars);
        List<Integer> result = racingGameService.startRace(new FixedNumberGenerator());

        assertThat(result.size()).isEqualTo(numberOfCars);
    }
}