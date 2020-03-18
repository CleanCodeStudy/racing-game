package racing.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class DefaultRacingGameServiceGeneratorTest {

    @DisplayName("RacingGamaeServiceGenertaor")
    @Test
    void racingGameService() throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/seojaeyeon/study/racinggame/racing-game/src/test/java/racing/service/racinggame-info.txt"));
        RacingGameServiceGenerator.generate();

    }
}
