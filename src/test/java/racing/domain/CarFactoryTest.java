package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarFactoryTest {

    @DisplayName("입력한 자동차의 갯수만큼 자동차의 값이 잘 들어왔는지 확인한다.")
    @Test
    public void createCars1() {
        List<String> expected = Arrays.asList(
                "bang",
                "ki",
                "hyun");
        List<Car> actual = CarFactory.createCars(expected);
        assertEquals(expected.size(), actual.size());
    }

    @DisplayName("자동차의 이름이 입력한 값과 같은지 확인한다.")
    @Test
    public void createCars2() {
        List<String> expected = Arrays.asList(
                "bang",
                "ki",
                "hyun");
        List<Car> actual = CarFactory.createCars(expected);
        assertEquals(expected.get(0), actual.get(0).getName());
        assertEquals(expected.get(1), actual.get(1).getName());
        assertEquals(expected.get(2), actual.get(2).getName());
    }
}
