package racing.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomUtilTest {

    @DisplayName("랜덤으로 생성된 값이 4보다 작을경우 0을 리턴한다.")
    @ParameterizedTest
    @ValueSource(ints = {1, 3})
    public void getRandomDistance1(int distance) {
        int actual = RandomUtil.getRandomDistance(new FixedNumberGenerator(distance));
        assertEquals(0, actual);
    }

    @DisplayName("랜덤으로 생성된 값이 4 이상을 경우 1을 리턴한다.")
    @ParameterizedTest
    @ValueSource(ints = {4, 5})
    public void getRandomDistance2(int distance) {
        int actual = RandomUtil.getRandomDistance(new FixedNumberGenerator(distance));
        assertEquals(1, actual);
    }
}
