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
            public boolean canMove() {
                return true;
            }
        };

        // then
        assertThat(carMover.canMove()).isEqualTo(true);
    }
}