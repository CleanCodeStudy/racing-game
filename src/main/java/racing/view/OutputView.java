package racing.view;

import racing.dto.RacingGameResult;
import racing.vo.CarOfPerRound;
import racing.vo.RacingCarsOfPerRound;

import java.util.List;

public class OutputView {

    private static final String TRACK_SIGNATURE = "-";

    public static void printResult(RacingGameResult racingGameResult) {
        List<RacingCarsOfPerRound> racingCarsPerRound = racingGameResult.getRacingCarsPerRound();
        for (RacingCarsOfPerRound racingCarsOfPerRound : racingCarsPerRound) {
            printNameAndTrack(racingCarsOfPerRound);
            System.out.println();
        }

    }

    private static void printNameAndTrack(RacingCarsOfPerRound racingCarsOfPerRound) {
        for (CarOfPerRound carOfPerRound : racingCarsOfPerRound.getCarOfPerRounds()) {
            System.out.printf("%s: ", carOfPerRound.getName());
            drawTrack(carOfPerRound);
        }
    }

    private static void drawTrack(CarOfPerRound car) {
        StringBuilder track = new StringBuilder();
        for (int i = 0; i < car.getLocation(); i++) {
            track.append(TRACK_SIGNATURE);
        }
        System.out.println(track.toString());
    }

}
