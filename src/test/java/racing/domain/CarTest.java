package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racing.domain.Car;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    @DisplayName("move() 호출시 거리값이 잘 계산되어 나오는지 확인")
    @CsvSource({"true", "false"})
    @ParameterizedTest
        // 파라미터  @ParameterizedTest 검색해서 true일때 false 일떄 ㄴ둘다테스트를 한꺼번에 가능
    void distanceRangeCheck(Boolean state) {
        // given
        Car car = new Car(() -> true);//이 true놈을 변수로 둬서
        car.move();

        // then
        assertThat(car.getDrivenDistance()).isEqualTo(1);
    }
}