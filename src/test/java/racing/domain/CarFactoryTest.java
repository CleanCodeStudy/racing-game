package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {

    @DisplayName("입력 수량대로 자동차를 만드는지 테스트")
    @Test
    void createCars() {
        // given
        int quantity = 3;
        RacingCars racingCars = CarFactory.createRacingCars(quantity, new CarMover());

        // then
        assertThat(racingCars.getCars().size()).isEqualTo(quantity);
    }
}