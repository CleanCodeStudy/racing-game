package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {

    @DisplayName("입력 수량대로 자동차를 만드는지 테스트")
    @Test
    void createCars() {
        // given
        int quantity = 2;
        CarMover carMover = new CarMover();
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(carMover));
        cars.add(new Car(carMover));
        cars.add(new Car(carMover));
        RacingCars expectedRacingCars = new RacingCars(cars);

        //when
        RacingCars racingCars = CarFactory.createRacingCars(quantity, carMover);

        // then
        assertThat(racingCars).isEqualTo(expectedRacingCars);
    }
}