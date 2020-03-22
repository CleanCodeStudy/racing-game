package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class DefaultEngineTest {

    @DisplayName("랜덤넘버 잘 추출하는지 테스트")
    @Test
    void engin() {
        DefaultEngine defaultEngine = new DefaultEngine();
        assertThat(defaultEngine.tryMove()).isBetween(0, 10);
    }

}