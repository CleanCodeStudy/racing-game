package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class CarTest {

    @DisplayName("Car가 4이상의 숫자를 얻으면 이동하고, 4이하의 숫자를 얻으면 이동하지 않는다")
    @CsvSource({"4,1", "5,1", "6,1", "1,0", "2,0", "3,0"})
    @ParameterizedTest
    void moveCar(int input, int expected) {
        Engine engine = () -> input >= 4 ? 1 : 0;
        Car car = new Car();
        car.tryMoveWith(engine);

        assertThat(car.getLocation()).isEqualTo(expected);
    }


}
