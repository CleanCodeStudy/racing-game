package racing.input;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class InputValueTest {

    @DisplayName("입력값 유효성 검사")
    @CsvSource(value = {" +,1", "*1,2", "3, (", "4,a"})
    @ParameterizedTest
    public void validInputValue(String inputCarValue, String inputRoundValue) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new InputValue(inputCarValue, inputRoundValue));
    }

    @DisplayName("입력된 자동차의 개수와 라운드 횟수를 정확하게 가지고 있는지 확인.")
    @CsvSource(value = {"1,2", "2,3", "10, 20", "30,20", "10,2"})
    @ParameterizedTest
    public void carCountAndRoundCountTest(String inputCarValue, String inputRoundValue) {
        InputValue inputValue = new InputValue(inputCarValue, inputRoundValue);
        assertThat(Integer.parseInt(inputCarValue)).isEqualTo(inputValue.getRacingCarCounts());
        assertThat(Integer.parseInt(inputRoundValue)).isEqualTo(inputValue.getRoundCounts());
    }

}