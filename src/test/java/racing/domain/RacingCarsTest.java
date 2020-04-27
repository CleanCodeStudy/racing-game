package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.dto.RacingGameInfo;
import racing.vo.CarSnapshot;
import racing.vo.RacingCarsSnapshot;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class RacingCarsTest {

    @DisplayName("현재라운드와 엔진을 가지고 RacingCars가 경기를 한번 하면 경기기록을 반환한다")
    @Test
    void currentRacing() {
        //given
        RacingCars racingCars = new RacingCars(new RacingGameInfo("a,b", "5"));
        List<CarSnapshot> carSnapshots = Arrays.asList(new CarSnapshot("a", 1), new CarSnapshot("b", 1));
        RacingCarsSnapshot expectRacingCarsSnapshot = new RacingCarsSnapshot(1, carSnapshots);
        //when
        RacingCarsSnapshot snapshot = racingCars.runWith(1, () -> true);

        //then
        assertThat(snapshot).isEqualTo(expectRacingCarsSnapshot);
    }
}
