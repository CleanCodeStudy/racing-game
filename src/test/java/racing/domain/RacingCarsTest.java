package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class RacingCarsTest {

    @DisplayName("생성자 파라미터로 받은 자동차 수만큼 생성하는 테스트")
    @CsvSource({"1", "2", "3"})
    @ParameterizedTest
    void createCarTest(int condition) {
        RacingCars racingCars = new RacingCars(condition);

        assertThat(racingCars.getCars().size()).isEqualTo(condition);
    }
}
