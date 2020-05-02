package racing.view;

import racing.dto.RacingGameResult;
import racing.vo.CarSnapshot;
import racing.vo.RacingCarsSnapshot;

import java.util.List;

public class OutputView {

    private static final String TRACK_SIGNATURE = "-";

    public static void printResult(RacingGameResult racingGameResult) {
        List<RacingCarsSnapshot> racingCarsPerRound = racingGameResult.getRacingCarsSnapshots();
        for (RacingCarsSnapshot racingCarsSnapshot : racingCarsPerRound) {
            printNameAndTrack(racingCarsSnapshot);
            System.out.println();
        }

    }

    private static void printNameAndTrack(RacingCarsSnapshot racingCarsSnapshot) {
        for (CarSnapshot carSnapshot : racingCarsSnapshot.getCarSnapshots()) {
            System.out.printf("%s: ", carSnapshot.getName());
            drawTrack(carSnapshot);
        }
    }

    private static void drawTrack(CarSnapshot car) {
        StringBuilder track = new StringBuilder();
        for (int i = 0; i < car.getLocation(); i++) {
            track.append(TRACK_SIGNATURE);
        }
        System.out.print(track.toString());
        System.out.println();
    }

}
