package racing.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputVIewTest {

    @DisplayName("Scanner로 입력된 값이 잘 잘 반환되는지 확인한다.")
    @ParameterizedTest
    @ValueSource(strings = {"10", "7"})
    public void inputCarTest(String input) {
        InputView inputView = new InputView(new Scanner(input));
        assertEquals(Integer.parseInt(input), inputView.inputCarCount());
    }


    @DisplayName("Scanner로 입력된 값이 양수가 아닐때 예외를 발생시킨다.")
    @ParameterizedTest
    @ValueSource(strings = {"-1", "0"})
    public void inputCarCount(String input) {
        InputView inputView = new InputView(new Scanner(input));
        assertThatThrownBy(() -> inputView.inputCarCount())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("입력하신 값이 양수가 아닙니다.");
    }
}
