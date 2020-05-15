package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
class GameInfoTest {

    @ParameterizedTest
    @DisplayName("경기에 참여하는 차가 없을시 예외 발생 확인.")
    @ValueSource(strings = {",", "  ", "", " , "})
    public void hasCarTest(String carNames) {
        assertThatThrownBy(() ->  new GameInfo(carNames, "0")).isInstanceOf(ArithmeticException.class)
        .hasMessage("경주에 참여하는 자동차가 없습니다.");
    }


    @Test
    @DisplayName("라운드 횟수값이 음수 혹은 정수가 아닌 값이 들어왔을때 예외처리 하는지 확인.")
    public void inputRoundCountValidTest() {
        String racingCarNames = "tesla, discovery";
        assertThatThrownBy(() -> new GameInfo(racingCarNames, "-1"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("음수 값이 입력되었습니다.");

        assertThatThrownBy(() -> new GameInfo(racingCarNames, "에러터져라"))
                .isInstanceOf(NumberFormatException.class)
                .hasMessage("정수가 아닌 값이 입력 되었습니다.");
    }

    @Test
    @DisplayName("경기 정보을 가지고 있는지 확인")
    public void hasGameInfo() {
        String carNames = "nathan,migos,IU";
        String roundCount = "3";
        GameInfo gameInfo = new GameInfo(carNames, roundCount);
        assertEquals(Arrays.stream(carNames.split(",")).collect(Collectors.toList()), gameInfo.getCarNames());
        assertEquals(Integer.parseInt(roundCount), gameInfo.getRoundCount());

    }
}