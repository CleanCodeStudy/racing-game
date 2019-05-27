import dto.RacingGameInfo;
import service.RacingGameService;
import ui.InputView;
import ui.OutputView;

public class GameScenario {

    public void racingGame(){
        RacingGameService racingGameService = new RacingGameService(makeRacingGameInfo());
        racingGameService.startGame();
        OutputView.printResult(racingGameService.getAttendee());
    }

    private RacingGameInfo makeRacingGameInfo(){
        return InputView.askRacingGameInfo();
    }
}
