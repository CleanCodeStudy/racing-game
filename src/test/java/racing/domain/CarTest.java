package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.domain.Car;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @DisplayName("move() 호출시 거리값이 잘 계산되어 범위 내에 있는지 확인")
    @Test
    void distanceRangeCheck() {
        // given
        int timesOfMoves = 3;
        Car car = new Car();

        // when
        for (int i = 0; i < timesOfMoves; i++) {
            car.move();
        }

        // then
        assertThat(car.getDrivenDistance()).isBetween(0, timesOfMoves);
    }
}