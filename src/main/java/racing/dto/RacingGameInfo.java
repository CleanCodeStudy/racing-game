package racing.dto;

import java.util.Arrays;
import java.util.List;

public class RacingGameInfo {
    private static final String NAME_SPLITTER = ",";

    private List<String> carGroup;
    private int countOfMovement;

    public RacingGameInfo(String nameOfCars, String countOfMovement) {
        try {
            List<String> carGroup = toCarGroup(nameOfCars);
            int inputCountOfMovement = Integer.parseInt(countOfMovement);

            validation(carGroup.size(), inputCountOfMovement);

            this.carGroup = carGroup;
            this.countOfMovement = inputCountOfMovement;
        } catch (NumberFormatException ne) {
            throw new IllegalArgumentException("Integer 값만 들어올 수 있습니다");
        }
    }

    private List<String> toCarGroup(String carGroup) {
        return Arrays.asList(carGroup.trim().split(NAME_SPLITTER));
    }

    private void validation(int inputNumberOfCar, int inputCountOfMovement) {
        if (inputNumberOfCar <= 0 || inputCountOfMovement <= 0) {
            throw new IllegalArgumentException("0이하의 값은 입력할 수 없습니다");
        }
    }

    public List<String> getCarGroup() {
        return carGroup;
    }

    public int getCountOfMovement() {
        return countOfMovement;
    }

}
