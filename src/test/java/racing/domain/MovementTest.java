package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MovementTest {

    @DisplayName("4보다 작은 값을 생성하면 HOLD 리턴")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    public void randomValueTestHold(int number) {
        Movement movement = Movement.nextMovement(new FixedNumberGenerator(number));

        assertEquals(Movement.HOLD, movement);
    }

    @DisplayName("4보다 크고 같은 값을 생성하면 HOLD 리턴")
    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7, 8, 9})
    public void randomValueTestMove(int number) {
        Movement movement = Movement.nextMovement(new FixedNumberGenerator(number));

        assertEquals(Movement.MOVE, movement);
    }
}