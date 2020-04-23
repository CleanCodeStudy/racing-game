package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RacingCarsTest {

    @DisplayName("일급 객체 생성 테스트")
    @Test
    void racingCars() {
        // given
        CarMover carMover = new CarMover();
        Car car1 = new Car(carMover);
        Car car2 = new Car(carMover);
        List<Car> cars = Arrays.asList(car1, car2);

        RacingCars racingCars = new RacingCars(cars);

        // then
        assertThat(racingCars).isEqualTo(new RacingCars(Arrays.asList(car1, car2)));
    }

    @DisplayName("RacingCars의 move를 호출 했을 때 주행거리가 바뀌는지 검사")
    @Test
    void getDistances() {
        // given
        Car car = new Car(() -> true);
        List<Car> cars = Arrays.asList(car);

        RacingCars racingCars = new RacingCars(cars);

        // when
        racingCars.move();

        // then
        assertThat(racingCars.getDistances()).isEqualTo(Arrays.asList(1));
    }
}