package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RacingFieldTest {

    @DisplayName("race() 메소드 호출로 RacingResult객체가 제대로 나오는지 확인")
    @Test
    void name() {
        // given
        List<String> carNames = Arrays.asList("name1", "name2");
        RacingCars racingCars = CarFactory.createRacingCars(carNames, () -> true);
        RacingField racingField = new RacingField(1, racingCars);

        RacingTurns expectedRacingTurns = new RacingTurns(Arrays.asList(new RacingTurn(Arrays.asList(1, 1))));
        RacingResult expectedRacingResult = new RacingResult(expectedRacingTurns, carNames);

        // when
        RacingResult racingResult = racingField.race();

        // then
        assertThat(racingResult).isEqualTo(expectedRacingResult);

        //...???
        // RacingField의 어떤 부분을 테스트 해야될지 잘 모르겠습니다
        // public 으로 뚫려있는 race() 에서 뱉어내는 RacingResult가 기대하는 값인지를
        // 테스트하는게 맞는지 모르겠습니다.
    }
}