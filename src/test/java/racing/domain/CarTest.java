package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racing.domain.support.Engine;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class CarTest {

    @DisplayName("Car가 4이상의 숫자를 얻으면 이동하고, 4이하의 숫자를 얻으면 이동하지 않는다")
    @CsvSource({"4, 1", "3, 0"})
    @ParameterizedTest
    void moveCar(int input, int expected) {
        //given
        int moveCondition = 4;
        Engine engine = () -> input >= moveCondition ? true : false;
        Car car = new Car();

        // when
        car.tryMoveWith(engine);

        assertThat(car.getLocation()).isEqualTo(expected);
    }


}
