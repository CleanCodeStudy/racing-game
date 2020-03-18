package racing.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class InputViewTest {

    @DisplayName("자동차 대수를 입력받은 대로 리턴한다")
    @Test
    void askNumberOfCar() {
        System.setIn(new ByteArrayInputStream("5".getBytes()));

        assertThat(InputView.askNumberOfCar()).isEqualTo("5");
    }

    @DisplayName("이동횟수를 입력받은 대로 리턴한다")
    @Test
    void askNumberOfMovement() {
        System.setIn(new ByteArrayInputStream("5".getBytes()));

        assertThat(InputView.askCountOfMovement()).isEqualTo("5");
    }
}
