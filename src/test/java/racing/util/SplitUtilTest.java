package racing.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SplitUtilTest {

    @DisplayName("경주할 자동차의 이름이 올바르게 들어왔을시 구분자(,)에 따라 잘 분리됐는지 확인한다.")
    @ParameterizedTest
    @CsvSource(value = {"bang,ki,hyun:bang:ki:hyun", "oh,my,god:oh:my:god"}, delimiter = ':')
    public void split(String carNames, String expected1, String expected2, String expected3) {
        List<String> actual = SplitUtil.split(carNames);
        assertEquals(3, actual.size());
        assertEquals(expected1, actual.get(0));
        assertEquals(expected2, actual.get(1));
        assertEquals(expected3, actual.get(2));
    }

    @DisplayName("자동차 이름의 입력이 아무것도 들어오지 않았을 시 예외를 발생시킨다")
    @Test
    public void checkEmpty() {
        String carNames = "";
        assertThatThrownBy(() -> SplitUtil.split(carNames))
                .isInstanceOf(NullPointerException.class)
                .hasMessage("경주할 자동차 이름을 입력하지 않았습니다.");
    }

    @DisplayName("자동차 대수가 한대 이상이 아닐시 예외를 발생시킨다.")
    @ParameterizedTest
    @ValueSource(strings = {",,,", ",,"})
    public void checkCount(String carNames) {
        assertThatThrownBy(()-> SplitUtil.split(carNames))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("게임을 진행하려면 한대 이상의 자동차가 필요합니다.");
    }

    @DisplayName("자동차의 이름이 겹칠경우 예외를 발생시킨다.")
    @ParameterizedTest
    @ValueSource(strings = {"bang,bang", "bang,ki,ki"})
    public void checkDuplicate(String carNames) {
        assertThatThrownBy(() -> SplitUtil.split(carNames))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차의 이름은 모두 달라야 합니다.");
    }
}
