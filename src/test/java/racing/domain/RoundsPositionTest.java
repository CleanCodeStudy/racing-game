package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RoundsPositionTest {

    @Test
    @DisplayName("새로운 Position값이 잘 들어가는지 확인.")
    void addPositionTest() {
        RoundsPosition roundsPosition = new RoundsPosition();

        roundsPosition.addPosition(3);
        roundsPosition.addPosition(4);
        assertEquals(3, roundsPosition.getRoundPosition(1));
    }

    @Test
    @DisplayName("마지막에 삽입된 Position 값을 반환하는지 확인.")
    void peek() {
        RoundsPosition roundsPosition = new RoundsPosition();
        roundsPosition.addPosition(2);
        assertEquals(2, roundsPosition.peek());
    }
}