package racing.view;

import java.util.Scanner;

public class InputView {
    private final String FIRST_QUESTION = "자동차 대수는 몇 대 인가요?";
    private final String SECOND_QUESTION = "시도할 횟수는 몇 회 인가요?";

    private final Scanner sc;

    public InputView(Scanner sc) {
        this.sc = sc;
    }

    public int inputCarCount() {
        System.out.println(FIRST_QUESTION);
        return new InputCount(sc.nextInt()).getCount();
    }

    public int inputTryCount() {
        System.out.println(SECOND_QUESTION);
        return new InputCount(sc.nextInt()).getCount();
    }
}
