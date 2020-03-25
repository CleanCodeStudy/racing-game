package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarMoverTest {

    @DisplayName("MoveResult 가 0또는 1을 반환하는지 검사")
    @Test
    void testMoveResult() {
        // given
        CarMover carMover = new CarMover();

        // then
        assertThat(carMover.moveResult()).isBetween(CarMover.GO_NOTHING, CarMover.GO_FORWARD);
    }
}