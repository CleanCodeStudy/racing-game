package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.RacingGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class WinnersTest {

    @Test
    @DisplayName("승리한 RacingCar을 모두 반환하는지 확인.")
    public void getWinnersTest() {
        List<RacingCar> racingCars = new ArrayList<>();
        RacingCar kia = new RacingCar("KIA");
        RacingCar tesla = new RacingCar("tesla");
        RacingCar hyundai = new RacingCar("hyundai");
        kia.attendRound(new FixedNumberGenerator(4));
        hyundai.attendRound(new FixedNumberGenerator(5));
        tesla.attendRound(new FixedNumberGenerator(2));
        racingCars.add(kia);
        racingCars.add(hyundai);
        racingCars.add(tesla);
        List<RacingCar> winnerCars = new ArrayList<>();
        winnerCars.add(kia);
        winnerCars.add(hyundai);

        Winners winners = new Winners(racingCars);
        assertEquals(winnerCars, winners.getWinners());
    }

}