package racing.view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String DELIMETER = ",";

    public static int inputNumberOfAttempts() {
        System.out.println("시도할 횟수는 몇 회 인가요?");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자르 입력해주세요.");
        }
    }

    public static String[] inputNameOfCars() {
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,)를 기준으로 구분)");
        String names = scanner.nextLine();

        return names.split(DELIMETER);
    }
}
