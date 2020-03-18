package racing.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.dto.RacingGameInfo;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class DefaultRacingGameServiceTest {

    @DisplayName("입렭받는 RacingGameInfo 의 자동차 수만큼 RacingCars에 Car를 추가한다")
    @Test
    void makeRacingCars() {
        RacingGameInfo racingGameInfo = new RacingGameInfo(5, 5);
        DefaultRacingGameService defaultRacingGameService = new DefaultRacingGameService(racingGameInfo);

        assertThat(defaultRacingGameService.getRacingCars().size()).isEqualTo(5);
    }

}
