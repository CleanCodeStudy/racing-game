package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarMoverTest {

    @DisplayName("MoveResult 가 원하는 값을 반환 하는지 검사")
    @Test
    void testMoveResult() {
        // given
        CarMover carMover = new CarMover() {
            @Override
            public int moveResult() {
                return CarMover.GO_FORWARD;
            }
        };

        // then
        assertThat(carMover.moveResult()).isEqualTo(CarMover.GO_FORWARD);
    }
}