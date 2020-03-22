package racing.view;

import racing.domain.Car;
import racing.domain.RacingCars;

public class OutputView {

    private static final String TRACK_SIGNATURE = "-";

    public static void printResult(RacingCars racingCars) {
        for (Car car : racingCars.getCars()) {
            drawTrack(car.getLocation());
        }
        System.out.println("####################");
    }

    private static void drawTrack(int location) {
        StringBuilder track = new StringBuilder();
        for (int i = 0; i < location; i++) {
            track.append(TRACK_SIGNATURE);
        }
        System.out.println(track.toString());

    }

}
