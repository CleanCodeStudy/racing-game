package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racing.domain.Car;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    @DisplayName("move() 호출시 거리값이 잘 계산되어 나오는지 확인")
    @CsvSource({"true,1", "false,0"})
    @ParameterizedTest
    void distanceRangeCheck(Boolean state, int expectedDistance) {
        // given
        Car car = new Car(() -> state);
        car.move();

        // then
        assertThat(car.getDrivenDistance()).isEqualTo(expectedDistance);
    }
}