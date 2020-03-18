package racing.dto;

public class RacingGameInfo {

    private static final int GAME_COUNT = 5;
    private final int numberOfCar;
    private final int countOfMovement;

    public RacingGameInfo(int numberOfCar, int countOfMovement) {
        validate(numberOfCar, countOfMovement);
        this.numberOfCar = numberOfCar;
        this.countOfMovement = countOfMovement;
    }

    public static int getGameCount() {
        return GAME_COUNT;
    }

    private void validate(int numberOfCar, int countOfMovement) {
        if (numberOfCar <= 0 || countOfMovement <= 0) {
            throw new IllegalArgumentException("자동차 대수와 이동횟수는 0 이하의 값을 가질 수 없습니다");
        }
    }

    public int getNumberOfCar() {
        return numberOfCar;
    }

    public int getCountOfMovement() {
        return countOfMovement;
    }

}
