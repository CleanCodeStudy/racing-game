package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RacingCarsTest {

    @DisplayName("RacingCars의 move를 호출 했을 때 주행거리가 바뀌는지 검사")
    @Test
    void getDistances() {
        // given
        RacingCars racingCars = CarFactory.createRacingCars(
                Arrays.asList("name"), new CarMover()
        );
        // when
        racingCars.move();

        // then
        assertThat(racingCars.getDistances()).isEqualTo(Arrays.asList(1));
    }

    @DisplayName("RacingCars내의 Car들의 이름 일치하는지 검사")
    @Test
    void getCarNames() {
        // given
        String name1 = "name1";
        String name2 = "name2";
        List<String> expectedCarsNames = Arrays.asList(name1, name2);
        RacingCars racingCars = CarFactory.createRacingCars(expectedCarsNames, new CarMover());

        // when
        List<String> racingCarsNames = racingCars.getCarNames();

        // then
        assertThat(racingCarsNames).isEqualTo(expectedCarsNames);
    }

    @DisplayName("RacingCars에 빈 CarList 넣으면 Exception")
    @Test
    public void verifyCarsNotEmpty() {
        // then
        assertThatThrownBy(() -> new RacingCars(Collections.emptyList()))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("RacingCars는 항상 Car가 1개 이상이어야 합니다.");
    }
}