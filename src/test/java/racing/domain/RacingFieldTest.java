//package racing.domain;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//class RacingFieldTest {
//
//    @DisplayName("레이싱 게임 입력 턴 수에 따른 결과 턴 수 확인")
//    @Test
//    void racingTurnsSizeCheck() {
//        // given
//        int totalTurns = 3;
//        RacingCars emptyCars = new RacingCars(Collections.emptyList());
//        RacingField racingField = new RacingField(totalTurns, emptyCars);
//
//        // when
//        List<RacingTurn> racingTurns = racingField.race();
//
//        // then
//        assertThat(racingTurns.size()).isEqualTo(totalTurns);
//    }
//
//    @DisplayName("레이싱 게임 시작 후 레이싱 결과가 제대로 나오는지 확인")
//    @Test
//    void asdf() {
//        // given
//        Car car = new Car(() -> true);
//        List<Car> cars = Arrays.asList(car);
//
//        int totalTurns = 1;
//        RacingCars racingCars = new RacingCars(cars);
//        RacingField racingField = new RacingField(totalTurns, racingCars);
//
//        RacingTurn racingTurn = new RacingTurn(Arrays.asList(1));
//        List<RacingTurn> expectedRacingTurns = Arrays.asList(racingTurn);
//
//        // when
//        List<RacingTurn> racingTurns = racingField.race();
//
//        // then
//        assertThat(racingTurns).isEqualTo(expectedRacingTurns);
//    }
//}