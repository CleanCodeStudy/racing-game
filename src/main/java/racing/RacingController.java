package racing;

import racing.service.RacingGameService;
import racing.service.RacingGameServiceGenerator;

public class RacingController {

    public static void main(String[] args) {
        RacingGameService racingGameService = RacingGameServiceGenerator.generate();
        racingGameService.race();
        racingGameService.announceResult();
    }
}
