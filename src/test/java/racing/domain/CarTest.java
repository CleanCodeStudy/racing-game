package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import racing.util.FixedNumberGenerator;
import racing.util.RandomDistanceUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @DisplayName("자동차가 랜덤으로 들어온 값이 4이상일 때 전진하고 4미만일 때 움직이지 않는다.")
    @ParameterizedTest
    @CsvSource({"4,5", "10,11", "1,1", "2,2"})
    void move(int distance, int expected) {
        Car car = new Car("bang", distance);
        car.move(RandomDistanceUtil.getRandomDistance(new FixedNumberGenerator(distance)));
        assertEquals(expected, car.getDistance());
    }
}
