package racing.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racing.util.FixedNumberGenerator;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarsTest {
    private List<String> carNames;
    private Cars cars;

    @BeforeEach
    public void setup() {
        carNames = Arrays.asList(
                "bang",
                "ki",
                "hyun");

        cars = new Cars(CarFactory.createCars(carNames));
    }

    @DisplayName("자동차 경주가 시도 횟수만큼 실행됐는지 확인한다.")
    @ParameterizedTest
    @ValueSource(ints = {3, 5})
    void operate1(int expected) {
        EachRoundResult eachRoundResult = new EachRoundResult();
        cars.operate(expected, new FixedNumberGenerator(10), eachRoundResult);
        assertEquals(expected, eachRoundResult.size());
    }

    @DisplayName("자동차 경주의 결과값이 잘 들어왔는지 확인한다.")
    @Test
    void operate2() {
        EachRoundResult eachRoundResult = new EachRoundResult();
        cars.operate(1, new FixedNumberGenerator(10), eachRoundResult);

        List<ResultCarInfo> resultCarInfos = eachRoundResult.getRoundResult(1);
        assertEquals(1, resultCarInfos.get(0).getDistance());
        assertEquals(carNames.get(0), resultCarInfos.get(0).getName());

        assertEquals(1, resultCarInfos.get(1).getDistance());
        assertEquals(carNames.get(1), resultCarInfos.get(1).getName());

        assertEquals(1, resultCarInfos.get(2).getDistance());
        assertEquals(carNames.get(2), resultCarInfos.get(2).getName());
    }
}
