package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.domain.Car;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @DisplayName("move() 호출시 거리값이 잘 계산되어 나오는지 확인")
    @Test
    void distanceRangeCheck() {
        // when
        Car car = new Car(() -> CarMover.GO_FORWARD);
        car.move();

        // then
        assertThat(car.getDrivenDistance()).isEqualTo(CarMover.GO_FORWARD);
    }
}