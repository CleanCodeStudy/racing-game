package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarFactoryTest {
    @DisplayName("자동차의 갯수가 입력한 값과 같은지 확인한다.")
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 6})
    public void createCar(int carCount){
        List<Car> cars = CarFactory.createCar(carCount);
        assertEquals(carCount, cars.size());
    }
}
