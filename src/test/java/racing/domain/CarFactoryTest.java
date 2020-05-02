package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {

    @DisplayName("입력 수량대로 자동차를 만드는지 테스트")
    @Test
    void createCars() {
        // given
        String name1 = "car1";
        String name2 = "car2";
        CarMover carMover = new CarMover();
        List<Car> cars = Arrays.asList(
                new Car(name1, carMover),
                new Car(name2, carMover)
        );
        RacingCars expectedRacingCars = new RacingCars(cars);

        //when
        RacingCars racingCars = CarFactory.createRacingCars(Arrays.asList(name1, name2), carMover);

        // then
        assertThat(racingCars).isEqualTo(expectedRacingCars);
    }
}