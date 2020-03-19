package racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MoverTest {

    @DisplayName("MoveResult 가 0또는 1을 반환하는지 검사")
    @Test
    void testMoveResult() {
        // given
        Mover mover = new Mover();

        // then
        assertThat(mover.moveResult()).isBetween(Mover.GO_NOTHING, Mover.GO_FORWARD);
    }
}