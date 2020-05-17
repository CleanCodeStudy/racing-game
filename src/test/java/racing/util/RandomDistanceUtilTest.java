package racing.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomDistanceUtilTest {

    @DisplayName("랜덤으로 생성된 값이 4미만을 경우 0을 리턴하고 4이상일 경우 1을 리턴한다.")
    @ParameterizedTest
    @CsvSource({"3,0", "4,1"})
    public void getRandomDistance(int input, int expected) {
        int actual = RandomDistanceUtil.getRandomDistance(new FixedNumberGenerator(input));
        assertEquals(expected, actual);
    }
}
