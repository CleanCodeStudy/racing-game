package racing.domain;

import java.util.*;

public class Winners {

    private final List<RacingCar> winners = new ArrayList<>();

    public Winners(List<RacingCar> racingCars) {
        List<RacingCar> sortedRacingCars = sortInDescendingOrderByLastPosition(racingCars);
        findWinners(sortedRacingCars);
    }

    private List<RacingCar> sortInDescendingOrderByLastPosition(List<RacingCar> racingCars) {
        Collections.sort(racingCars);
        return racingCars;
    }

    private void findWinners(List<RacingCar> racingCars) {
        int winnerPosition = getWinnerPosition(racingCars);
        for (RacingCar racingCar : racingCars) {
            addWinner(racingCar, winnerPosition);
        }
    }

    private int getWinnerPosition(List<RacingCar> sortedRacingCar) {
        return sortedRacingCar.get(0).getLastPosition();
    }

    private void addWinner(RacingCar racingCar, int winnerPosition) {
        if (isWinner(racingCar.getLastPosition(), winnerPosition)) {
            winners.add(racingCar);
        }
    }

    private boolean isWinner(int position, int winnerPosition) {
        return position==winnerPosition;
    }


    public List<RacingCar> getWinners() {
        return new ArrayList<>(winners);
    }
}
