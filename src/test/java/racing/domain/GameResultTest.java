package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class GameResultTest {

    private static PhaseResult makePhaseResult(int first, int second) {
        Map<String, Integer> raceResults = new LinkedHashMap<>();

        raceResults.put("pobi", first);
        raceResults.put("crong", second);

        return new PhaseResult(raceResults);
    }

    @DisplayName("각 시도에 맞는 phaseResult를 반환한다.")
    @Test
    void name() {
        GameResult gameResult = new GameResult(1);
        PhaseResult expectResult = makePhaseResult(1, 0);
        gameResult.addEachRacingResult(expectResult);

        PhaseResult result = gameResult.findRacingResultByPhase(1);
        assertThat(result).isEqualTo(expectResult);
    }

    @DisplayName("시도 횟수보다 크거나, 0 이하인 수는 IllegarArgumentException을 던진다.")
    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 2})
    void name1(int phaseNumber) {
        GameResult gameResult = new GameResult(1);
        gameResult.addEachRacingResult(makePhaseResult(1, 0));

        assertThatThrownBy(() -> gameResult.findRacingResultByPhase(phaseNumber))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(String.format("존재하지 않는 시도 횟수입니다. - %d \n", phaseNumber));
    }

    @DisplayName("게임 최종 우승자의 이름을 List로 반환한다.")
    @Test
    void name2() {
        GameResult gameResult = new GameResult(2);
        gameResult.addEachRacingResult(makePhaseResult(1, 0));
        gameResult.addEachRacingResult(makePhaseResult(2, 1));

        List<String> winners = gameResult.getWinner();
        assertThat(winners).isEqualTo(Arrays.asList("pobi"));
    }
}