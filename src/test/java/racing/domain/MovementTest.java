package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovementTest {

    @RepeatedTest(50)
    @DisplayName("다음 움직임이 멈춤 혹은 전진만 있는지 확인")
    void nextMovementTest() {
        Movement nextMovement = Movement.nextMovement();
        assertTrue(nextMovement.equals(Movement.MOVE) || nextMovement.equals(Movement.HOLD));
    }
}