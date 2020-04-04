package racing.view;

import racing.dto.CarOfPerRound;
import racing.dto.RacingCarsOfPerRound;
import racing.dto.RacingGameResult;

import java.util.List;

public class OutputView {

    private static final String TRACK_SIGNATURE = "-";

    public static void printResult(RacingGameResult racingGameResult) {
        List<RacingCarsOfPerRound> racingCarsPerRound = racingGameResult.getRacingCarsPerRound();
        for (RacingCarsOfPerRound racingCarsOfPerRound : racingCarsPerRound) {
            drawTrack(racingCarsOfPerRound);
            System.out.println();
        }

    }

    private static void drawTrack(RacingCarsOfPerRound racingCarsOfPerRound) {
        for (CarOfPerRound carOfPerRound : racingCarsOfPerRound.getCarOfPerRounds()) {
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
