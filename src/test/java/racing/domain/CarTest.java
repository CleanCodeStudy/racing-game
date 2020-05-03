package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racing.util.FixedNumberGenerator;
import racing.util.RandomUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @DisplayName("자동차가 랜덤으로 들어온 값이 4이상일 때 전진한다.")
    @ParameterizedTest
    @ValueSource(ints = {4, 9})
    void move1(int distance) {
        Car car = new Car(distance);
        car.move(RandomUtil.getRandomDistance(new FixedNumberGenerator(distance)));
        assertEquals(distance + 1, car.getDistance());
    }

    @DisplayName("자동차가 랜덤으로 들어온 값이 4 보다 작을 때 움직이지 않는다.")
    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void move2(int distance) {
        Car car = new Car(distance);
        car.move(RandomUtil.getRandomDistance(new FixedNumberGenerator(distance)));
        assertEquals(distance, car.getDistance());
    }
}
