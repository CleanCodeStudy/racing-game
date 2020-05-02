package racing.domain;

import java.util.Random;

public class CarMover implements Mover {
    private static final int RANDOM_ADJUSTER = 10;
    private static final int FORWARD_CONDITION = 4;

    private Random random = new Random();

    @Override
    public boolean canMove() {
        int randomNum = random.nextInt(RANDOM_ADJUSTER);
        return FORWARD_CONDITION <= randomNum;
    }

}
