package racing.domain;

import java.util.Random;

public class CarMover implements Mover {

    private static final int FORWARD_CONDITION = 4;
    private Random random = new Random();

    @Override
    public int moveResult() {
        int randomNum = getRandomIntUnder10();
        if (isGoForward(randomNum)) {
            return Status.GO_FORWARD.getValue();
        }
        return Status.GO_NOTHING.getValue();
    }

    private int getRandomIntUnder10() {
        return random.nextInt(10);
    }

    private boolean isGoForward(int randomNum) {
        return FORWARD_CONDITION <= randomNum;
    }
}
