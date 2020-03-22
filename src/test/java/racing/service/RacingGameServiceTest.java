package racing.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racing.FixedNumberGenerator;
import racing.domain.RacingGameResult;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class RacingGameServiceTest {
    @DisplayName("startRace는 게임 결과를 가지고 있는 Map을 반환한다.")
    @ParameterizedTest
    @CsvSource({"3,5", "1,2"})
    void name(int numberOfCars, int numberOfAttempts) {
        RacingGameService racingGameService = new RacingGameService(numberOfCars, numberOfAttempts);
        Map<Integer, List<Integer>> attemptResult = racingGameService.startRace(new FixedNumberGenerator());

        assertAll(
                () -> assertThat(attemptResult).containsValues()
        );
    }

    private List<Integer> makeMockKey(int numberOfAttempts) {
        return IntStream.rangeClosed(1, numberOfAttempts)
                .mapToObj(Integer::new)
                .collect(Collectors.toList());
    }
}