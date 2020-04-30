package racing.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

import static org.junit.jupiter.api.Assertions.*;

class RandomCreatorTest {

    @DisplayName("랜덤값이 0 이상 또는 9이하의 값으로 생성되는지 확인.")
    @RepeatedTest(50)
    public void randomValueTest(RepetitionInfo repetitionInfo) {
        int randomValue = RandomCreator.getRandomValue();
        assertTrue(randomValue >= 0 && 10 > randomValue);
    }

}