package racing.dto;

public class InputValueDto {
    private int numberOfCars;
    private String[] namesOfCars;
    final private int numberOfAttempts;

    public InputValueDto(int numberOfCars, int numberOfAttempts) {
        validateInputValue(numberOfCars, numberOfAttempts);
        this.numberOfCars = numberOfCars;
        this.numberOfAttempts = numberOfAttempts;
    }

    public InputValueDto(String[] namesOfCars, int numberOfAttempts) {
        validateInputValue(namesOfCars, numberOfAttempts);
        this.namesOfCars = namesOfCars;
        this.numberOfAttempts = numberOfAttempts;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public int getNumberOfAttempts() {
        return numberOfAttempts;
    }

    public String[] getNamesOfCars() {
        return namesOfCars;
    }

    private void validateInputValue(int numberOfCars, int numberOfAttempts) {
        if (numberOfCars <= 0) {
            throw new IllegalArgumentException("참여할 자동차의 대수는 0 보다 커야합니다.");
        }

        if (numberOfAttempts <= 0) {
            throw new IllegalArgumentException("시도할 횟수는 0 보다 커야합니다.");
        }
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
