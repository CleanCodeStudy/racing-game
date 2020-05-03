package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarsTest {
    @DisplayName("자동차의 갯수가 입력한 값과 같은지 확인한다.")
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 6})
    void size(int count) {
        Cars cars = new Cars(CarFactory.createCar(count));
        assertEquals(count, cars.size());
    }
}
