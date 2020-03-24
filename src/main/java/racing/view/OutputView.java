package racing.view;

import racing.domain.Car;
import racing.domain.RacingCars;
import racing.dto.RacingGameResult;

import java.util.List;

public class OutputView {

    private static final String TRACK_SIGNATURE = "-";

    public static void printResult(RacingGameResult racingGameResult) {
        List<RacingCars> racingCarsPerRound = racingGameResult.getRacingCarsPerRound();
        for (RacingCars racingCars : racingCarsPerRound) {
            drawTrack(racingCars);
            System.out.println();
        }

    }

    private static void drawTrack(RacingCars racingCars) {
        for (Car car : racingCars.getCars()) {
            drawTrack(car);
        }
    }

    private static void drawTrack(Car car) {
        StringBuilder track = new StringBuilder();
        for (int i = 0; i < car.getLocation(); i++) {
            track.append(TRACK_SIGNATURE);
        }
        System.out.println(track.toString());
    }

}
