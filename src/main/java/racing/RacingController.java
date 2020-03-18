package racing;

import racing.service.DefaultRacingGameService;
import racing.service.RacingGameServiceGenerator;

public class RacingController {

    public static void main(String[] args) {
        DefaultRacingGameService defaultRacingGameService = RacingGameServiceGenerator.generate();
        defaultRacingGameService.race();
        defaultRacingGameService.announceResult();
    }
}
