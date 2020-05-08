package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racing.input.InputValue;

import static org.junit.jupiter.api.Assertions.*;

class GameInfoTest {

    @Test
    @DisplayName("경기에 참여하는 차가 없을시 예외 발생 확인.")
    public void hasCarTest() {

        InputValue inputValue = new InputValue("0", "1");
        Throwable exception = assertThrows(ArithmeticException.class, () -> {
            new GameInfo(inputValue);
        });

        assertEquals("경주에 참여하는 자동차가 없습니다.", exception.getMessage());

    }

    @ParameterizedTest
    @DisplayName("경기 정보을 가지고 있는지 확인")
    @CsvSource(value = {"1,2", "2,3","3,4","5,2"})
    public void hasGameInfo(String racingCarCount, String roundCount) {
        GameInfo gameInfo = new GameInfo(new InputValue(racingCarCount, roundCount));
        assertEquals(Integer.parseInt(racingCarCount), gameInfo.getRacingCarCount());
        assertEquals(Integer.parseInt(roundCount), gameInfo.getRoundCount());

    }

    @Test
    @DisplayName("남은 라운드가 없을시 예외 처리하는지 확인.")
    public void isRemainRoundTest() {
        GameInfo gameInfo = new GameInfo(new InputValue("1","0"));
        Throwable exception = assertThrows(ArithmeticException.class, gameInfo::isRemainRound);
        assertEquals("남은 라운드가 없습니다.", exception.getMessage());
    }

}