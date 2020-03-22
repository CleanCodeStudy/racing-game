package racing.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class RacingGameServiceTest {

    @DisplayName("생성자로 입력받는 자동차 수만큼 RacingCars에 Car를 추가한다")
    @CsvSource({"1", "2", "3"})
    @ParameterizedTest
    void serviceMakingCar(int condition) {
        RacingGameService racingGameService = new RacingGameService(condition);

        assertThat(racingGameService.getRacingCars().getCars().size()).isEqualTo(condition);
    }

    @DisplayName("생성자로 입력받는 자동차 수가 0이하이면 익셉션")
    @CsvSource({"-1", "0"})
    @ParameterizedTest
    void makeCarException(int condition) {
        assertThatThrownBy(() -> new RacingGameService(condition))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("4이상의 숫자를 받으면 모든 RacingCar를 move한다")
    @CsvSource({"4", "5"})
    @ParameterizedTest
    void canMove(int condition) {
        RacingGameService racingGameService = new RacingGameService(3);

        racingGameService.raceWith(() -> condition);


        // 이 더러운 단언문은 어쩌면 좋죠
        assertAll(
                () -> assertThat(racingGameService.getRacingCars().getCars().get(0).getLocation()).isEqualTo(1),
                () -> assertThat(racingGameService.getRacingCars().getCars().get(1).getLocation()).isEqualTo(1),
                () -> assertThat(racingGameService.getRacingCars().getCars().get(2).getLocation()).isEqualTo(1)
        );

    }

    @DisplayName("4이하의 숫자를 받으면 RacingCar를 move하지않는다")
    @CsvSource({"1", "2"})
    @ParameterizedTest
    void cannotMove(int condition) {
        RacingGameService racingGameService = new RacingGameService(3);

        racingGameService.raceWith(() -> condition);


        // 이 더러운 단언문은 어쩌면 좋죠
        assertAll(
                () -> assertThat(racingGameService.getRacingCars().getCars().get(0).getLocation()).isEqualTo(0),
                () -> assertThat(racingGameService.getRacingCars().getCars().get(1).getLocation()).isEqualTo(0),
                () -> assertThat(racingGameService.getRacingCars().getCars().get(2).getLocation()).isEqualTo(0)
        );

    }

}
