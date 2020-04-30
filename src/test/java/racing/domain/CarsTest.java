package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CarsTest {
    private Cars cars;

    @DisplayName("자동차의 갯수가 입력한 값과 같은지 확인한다.")
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 6})
    void getSize(int count) {
        cars = new Cars(count);
        assertEquals(cars.getSize(), count);
    }

    @DisplayName("자동차가 랜덤으로 들어온 값만큼 움직였는지 확인한다.")
    @RepeatedTest(10)
    void moveCars(RepetitionInfo repetitionInfo) {
        cars = new Cars(5);
        cars.operate(1);

        for (int idx = 0; idx < cars.getSize(); idx++) {
            Car car = cars.getCar(idx);
            int postDistance = car.getDistance();
            System.out.println("Repetition #" + repetitionInfo.getCurrentRepetition() + " carDistance :" + postDistance);
            assertTrue(postDistance == 0 || (postDistance >= 4 && postDistance <= 9), "랜덤으로 들어온 값에따라 자동차가 움직지 않았습니다.");
        }
    }
}
