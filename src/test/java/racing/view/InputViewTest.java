package racing.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputViewTest {

    @DisplayName("Scanner로 입력된 시도 횟수가 양수일 때 입력값을 리턴한다.")
    @ParameterizedTest
    @ValueSource(strings = {"10", "7"})
    public void inputTryCount(String input) {
        InputView inputView = new InputView(new Scanner(input));
        assertEquals(Integer.parseInt(input), inputView.inputTryCount());
    }


    @DisplayName("Scanner로 입력된 값이 양수가 아닐때 예외를 발생시킨다.")
    @ParameterizedTest
    @ValueSource(strings = {"-1", "0"})
    public void checkPositiveNumber(String input) {
        InputView inputView = new InputView(new Scanner(input));
        assertThatThrownBy(() -> inputView.inputTryCount())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("최소 한번 이상의 게임을 진행해야 합니다.");
    }
}
