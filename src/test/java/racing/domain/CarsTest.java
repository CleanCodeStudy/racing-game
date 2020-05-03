package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racing.util.FixedNumberGenerator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarsTest {

    @DisplayName("자동차들이 랜덤한 값으로 들어온 값만큼 움직였는지 확인한다.")
    @ParameterizedTest
    @ValueSource(ints = {3, 5})
    void moveCars(int tryCount) {
        int carCount = 3;
        Cars cars = new Cars(CarFactory.createCar(carCount));
        RacingResult racingResult = cars.operate(tryCount, new FixedNumberGenerator(10));
        assertEquals(tryCount, racingResult.get(racingResult.size() - 1));
    }
}
