package racing.dto;

import java.util.Arrays;
import java.util.List;

public class RacingGameInfo {
    private static final String NAME_SPLITTER = ",";

    private final List<String> carNameGroup;
    private final int countOfMovement;

    public RacingGameInfo(String nameOfCars, String countOfMovement) {
        try {
            List<String> carGroup = toCarGroup(nameOfCars.trim());
            int inputCountOfMovement = Integer.parseInt(countOfMovement);

            validation(carGroup, inputCountOfMovement);

            this.carNameGroup = carGroup;
            this.countOfMovement = inputCountOfMovement;
        } catch (NumberFormatException ne) {
            throw new IllegalArgumentException("Integer 값만 들어올 수 있습니다");
        }
    }

    private List<String> toCarGroup(String carGroup) {
        return Arrays.asList(carGroup.split(NAME_SPLITTER));
    }

    private void validation(final List<String> inputNumberOfCar, final int inputCountOfMovement) {
        if (inputNumberOfCar.size() <= 1 || inputCountOfMovement <= 0) {
            throw new IllegalArgumentException("올바른 입력값이 아닙니다");
        }
    }

    public List<String> getCarNameGroup() {
        return carNameGroup;
    }

    public int getCountOfMovement() {
        return countOfMovement;
    }


}
