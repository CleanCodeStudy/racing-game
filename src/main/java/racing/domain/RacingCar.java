package racing.domain;

import racing.util.NumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class RacingCar {

    private List<Integer> roundPosition = new ArrayList<>();

    public RacingCar() {
        roundPosition.add(1);
    }

    public void attendRound(NumberGenerator numberGenerator) {
        if (Movement.nextMovement(numberGenerator).canMove()) {
            move();
            return;
        }
        roundPosition.add(getLastPosition());
    }

    private void move() {
        roundPosition.add(getLastPosition()+1);
    }

    private int getLastPosition() {
        return roundPosition.get(roundPosition.size()-1);
    }

    public int getRoundPosition(int round) {
        return roundPosition.get(round);
    }
}
