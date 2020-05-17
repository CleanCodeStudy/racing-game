package racing.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WinnersTest {
    private Winners winners;

    @BeforeEach
    public void setup() {
        List<String> names = Arrays.asList(
                "bang",
                "ki",
                "hyun");
        winners = new Winners(names);
    }

    @DisplayName("우승자의 이름을 잘 반환하는지 확인한다.")
    @ParameterizedTest
    @CsvSource({"bang,0", "ki,1", "hyun,2"})
    void getName(String expected, int idx) {
        assertEquals(expected, winners.getName(idx));
    }

    @DisplayName("우승자의 크기를 잘 반환하는지 확인한다.")
    @Test
    void size() {
        assertEquals(3, winners.size());
    }
}