package racing.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.util.SplitUtil;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarFactoryTest {
    private List<String> expected;

    @BeforeEach
    public void setup(){
        expected = Arrays.asList(
                "bang",
                "ki",
                "hyun");
    }

    @DisplayName("입력한 자동차의 갯수만큼 자동차의 값이 잘 들어왔는지 확인한다.")
    @Test
    public void createCar1() {
        List<Car> cars = CarFactory.createCar(expected);
        assertEquals(expected.size(), cars.size());
    }

    @DisplayName("자동차의 이름이 입력한 값과 같은지 확인한다.")
    @Test
    public void createCar2() {
        List<Car> cars = CarFactory.createCar(expected);
        assertEquals(expected.get(0), cars.get(0).getName());
        assertEquals(expected.get(1), cars.get(1).getName());
        assertEquals(expected.get(2), cars.get(2).getName());
    }
}
