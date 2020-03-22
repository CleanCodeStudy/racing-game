package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class RacingCarsTest {

    @DisplayName("생성자 파라미터로 받은 자동차 수만큼 생성하는 테스트")
    @CsvSource({"1", "2", "3"})
    @ParameterizedTest
    void createCarTest(int condition) {
        RacingCars racingCars = new RacingCars(condition);

        assertThat(racingCars.getCars().size()).isEqualTo(condition);
    }

    @DisplayName("RacingCars의 모든 Car가 4이상의 수를 받을 때 움직이는지 테스트")
    @CsvSource({"4", "5", "6"})
    @ParameterizedTest
    void racingcarsMoveTest(int condition) {
        RacingCars racingCars = new RacingCars(3);

        racingCars.runWith(() -> condition);

        assertAll(
                () -> assertThat(racingCars.getCars().get(0).getLocation()).isEqualTo(1),
                () -> assertThat(racingCars.getCars().get(1).getLocation()).isEqualTo(1),
                () -> assertThat(racingCars.getCars().get(2).getLocation()).isEqualTo(1)
        );
    }

    @DisplayName("RacingCars의 모든 Car가 4이하의 수를 받을 때 움직이지 않는지 테스트")
    @CsvSource({"1", "2", "3"})
    @ParameterizedTest
    void racingcarsCannotMoveTest(int condition) {
        RacingCars racingCars = new RacingCars(3);

        racingCars.runWith(() -> condition);

        assertAll(
                () -> assertThat(racingCars.getCars().get(0).getLocation()).isEqualTo(0),
                () -> assertThat(racingCars.getCars().get(1).getLocation()).isEqualTo(0),
                () -> assertThat(racingCars.getCars().get(2).getLocation()).isEqualTo(0)
        );
    }


}