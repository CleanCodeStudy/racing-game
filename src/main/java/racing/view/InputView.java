package racing.view;

import racing.input.InputValue;
import racing.input.Validator;

import java.util.Scanner;

public class InputView {

    private static final String INPUT_RACING_CAR_COUNTS = "자동차 대수는 몇 대 인가요?";
    private static final String INPUT_TRY_COUNTS = "시도할 횟수는 몇 회 인가요?";

    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println(INPUT_RACING_CAR_COUNTS);
        String carCounts = sc.nextLine();
        System.out.println(INPUT_TRY_COUNTS);
        String tryCounts = sc.nextLine();
        InputValue.initInputValue(carCounts, tryCounts);
    }
}
