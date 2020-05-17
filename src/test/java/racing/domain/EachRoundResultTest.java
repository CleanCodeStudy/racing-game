package racing.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EachRoundResultTest {
    private EachRoundResult eachRoundResult;

    @BeforeEach
    public void setup() {
        eachRoundResult = new EachRoundResult();
    }

    @DisplayName("값이 추가됐는지 확인한다.")
    @Test
    void addRoundResult() {
        List<ResultCarInfo> resultCarInfos = Arrays.asList(
                new ResultCarInfo("bang", 1),
                new ResultCarInfo("ki", 2),
                new ResultCarInfo("hyun", 3));
        eachRoundResult.addRoundResult(1, resultCarInfos);
        assertEquals(1, eachRoundResult.size());
    }

    @DisplayName("추가된 값을 잘 반환하는지 확인한다.")
    @Test
    void getRoundResult() {
        List<ResultCarInfo> expected = Arrays.asList(
                new ResultCarInfo("bang", 1),
                new ResultCarInfo("ki", 2),
                new ResultCarInfo("hyun", 3));
        eachRoundResult.addRoundResult(1, expected);

        assertEquals(expected, eachRoundResult.getRoundResult(1));
    }

    @DisplayName("레이싱 결과의 우승자를 잘 반환하는지 확인한다.")
    @Test
    void getWinners() {
        List<ResultCarInfo> resultCarInfos = Arrays.asList(
                new ResultCarInfo("bang", 1),
                new ResultCarInfo("ki", 0),
                new ResultCarInfo("hyun", 1));
        eachRoundResult.addRoundResult(1, resultCarInfos);

        List<String> actual = eachRoundResult.getWinners();
        assertEquals("bang", actual.get(0));
        assertEquals("hyun", actual.get(1));
    }
}
