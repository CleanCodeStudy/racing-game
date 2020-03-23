package racing.view;

import racing.dto.InputValueDto;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static InputValueDto getInputValue() {
        try {
            int numberOfCars = Integer.parseInt(inputNumberOfCars());
            int numberOfAttempts = Integer.parseInt(inputNumberOfAttempts());

            return new InputValueDto(numberOfCars, numberOfAttempts);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자를 입력해주세요.");
        }
    }

    public static String inputNumberOfCars() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return scanner.nextLine();
    }

    public static String inputNumberOfAttempts() {
        System.out.println("시도할 횟수는 몇 회 인가요?");
        return scanner.nextLine();
    }
}
