package racing.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomUtilTest {

    @DisplayName("랜덤으로 생성된 값이 0 또는 4이상 9이하의 값만 반환하는지 확인한다.")
    @RepeatedTest(100)
    public void getRandomDistance(RepetitionInfo repetitionInfo) {
        int distance = RandomUtil.getRandomDistance();
        System.out.println("Repetition #" + repetitionInfo.getCurrentRepetition() + " RandomValue :" +  distance);
        assertTrue((distance >= 4 && distance <= 9) || distance == 0, "0 또는 4이상 9이하의 값 외의 다른 값이 반환되었습니다.");
    }
}
