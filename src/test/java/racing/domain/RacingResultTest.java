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
        List<CarData> carData = Arrays.asList(new CarData("bang", 5),
                new CarData("ki", 10),
                new CarData("hyun", 15));
        RacingResult racingResult = new RacingResult(carData);
        List<String> winners = racingResult.getWinners();

        assertEquals(1, winners.size());
        assertEquals(winners.contains("hyun"), true);
    }

    @DisplayName("우승자가 여러명일 때 우승자의 크기와 이름을 포함하고 있는지 확인한다.")
    @Test
    void getWinner2() {
        List<CarData> carData = Arrays.asList(new CarData("bang", 10),
                new CarData("ki", 10),
                new CarData("hyun", 10));
        RacingResult racingResult = new RacingResult(carData);
        List<String> winners = racingResult.getWinners();

        assertEquals(3, winners.size());
        assertEquals(winners.contains("bang"), true);
        assertEquals(winners.contains("ki"), true);
        assertEquals(winners.contains("hyun"), true);
    }
}