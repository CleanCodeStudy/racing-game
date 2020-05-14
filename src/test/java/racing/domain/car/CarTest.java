package racing.domain.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @DisplayName("자동차는 random값이 4 이상일 때 움직인다.")
    @ParameterizedTest
    @CsvSource({
            "4, 1", "3, 0"
    })
    void name(int randomNumber, int expectedResult) {
        Car car = new Car("pobi");

        int actualResult = car.attemptToMove(randomNumber);

        assertThat(actualResult).isEqualTo(expectedResult);
    }
}