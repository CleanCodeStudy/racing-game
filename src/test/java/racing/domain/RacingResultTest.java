package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RacingResultTest {

    @DisplayName("우승자가 한명일 때 우승자의 크기와 이름을 포함하고 있는지 확인한다.")
    @Test
    void getWinner1() {
        List<Car> cars = Arrays.asList(new Car("bang", 5),
                new Car("ki", 10),
                new Car("hyun", 15));
        RacingResult racingResult = new RacingResult(cars);
        List<String> winners = racingResult.getWinners();

        assertEquals(1, winners.size());
        assertEquals(winners.contains("hyun"), true);
    }

    @DisplayName("우승자가 여러명일 때 우승자의 크기와 이름을 포함하고 있는지 확인한다.")
    @Test
    void getWinner2() {
        List<Car> cars = Arrays.asList(new Car("bang", 10),
                new Car("ki", 10),
                new Car("hyun", 10));
        RacingResult racingResult = new RacingResult(cars);
        List<String> winners = racingResult.getWinners();

        assertEquals(3, winners.size());
        assertEquals(winners.contains("bang"), true);
        assertEquals(winners.contains("ki"), true);
        assertEquals(winners.contains("hyun"), true);
    }
}