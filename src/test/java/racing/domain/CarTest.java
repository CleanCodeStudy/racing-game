package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class CarTest {

    @DisplayName("Car가 4이상의 숫자를 얻으면 이동한다")
    @CsvSource({"4", "5", "6", "7", "8", "9", "10"})
    @ParameterizedTest
    void moveCar(int input) {
        Car car = new Car();
        car.move(input);

        assertThat(car.getLocation()).isEqualTo(1);
    }

    @DisplayName("Car가 4이하의 숫자를 얻으면 이동하지않는다")
    @CsvSource({"1", "2", "3"})
    @ParameterizedTest
    void cannotMoveCar(int input) {
        Car car = new Car();
        car.move(input);

        assertThat(car.getLocation()).isEqualTo(0);
    }


}
