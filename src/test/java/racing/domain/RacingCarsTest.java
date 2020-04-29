package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RacingCarsTest {

    @DisplayName("RacingCars의 move를 호출 했을 때 주행거리가 바뀌는지 검사")
    @Test
    void getDistances() {
        // given
        String name = "name";
        List<Car> cars = Arrays.asList(new Car(name, () -> true));

        RacingCars racingCars = new RacingCars(cars);

        // when
        racingCars.move();

        // then
        assertThat(racingCars.getDistances()).isEqualTo(Arrays.asList(1));
    }
}