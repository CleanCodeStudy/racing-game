package racing.dto;

public class GameInformation {
    private String[] namesOfCars;
    private int numberOfAttempts;

    public GameInformation(String[] namesOfCars, int numberOfAttempts) {
        validateInputValue(namesOfCars, numberOfAttempts);
        this.namesOfCars = namesOfCars;
        this.numberOfAttempts = numberOfAttempts;
    }

    public int getNumberOfAttempts() {
        return numberOfAttempts;
    }

    public String[] getNamesOfCars() {
        return namesOfCars;
    }

    private void validateInputValue(String[] namesOfCars, int numberOfAttempts) {
        if (namesOfCars.length <= 0) {
            throw new IllegalArgumentException("입력된 자동차 이름의 개수는 0 보다 커야합니다.");
        }

        if (numberOfAttempts <= 0) {
            throw new IllegalArgumentException("시도할 횟수는 0 보다 커야합니다.");
        }
    }
}
