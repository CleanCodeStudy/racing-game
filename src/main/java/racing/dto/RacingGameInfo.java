package racing.dto;

public class RacingGameInfo {
    private int numberOfCar;
    private int countOfMovement;

    public RacingGameInfo(String numberOfCar, String countOfMovement) {
        try {
            int inputNumberOfCar = Integer.parseInt(numberOfCar);
            int inputCountOfMovement = Integer.parseInt(countOfMovement);

            validation(inputNumberOfCar, inputCountOfMovement);

            this.numberOfCar = inputNumberOfCar;
            this.countOfMovement = inputCountOfMovement;
        } catch (NumberFormatException ne) {
            throw new IllegalArgumentException("Integer 값만 들어올 수 있습니다");
        }
    }

    private void validation(int inputNumberOfCar, int inputCountOfMovement) {
        if (inputNumberOfCar <= 0 || inputCountOfMovement <= 0) {
            throw new IllegalArgumentException("0이하의 값은 입력할 수 없습니다");
        }
    }

    public int getNumberOfCar() {
        return numberOfCar;
    }

    public int getCountOfMovement() {
        return countOfMovement;
    }
}
