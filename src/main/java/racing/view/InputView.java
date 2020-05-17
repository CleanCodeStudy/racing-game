package racing.view;

import racing.util.SplitUtil;

import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final String FIRST_QUESTION = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String SECOND_QUESTION = "시도할 횟수는 몇 회 인가요?";

    private final Scanner sc;

    public InputView(Scanner sc) {
        this.sc = sc;
    }

    public List<String> inputCarNames() {
        System.out.println(FIRST_QUESTION);
        return SplitUtil.split(sc.nextLine());
    }

    public int inputTryCount() {
        System.out.println(SECOND_QUESTION);
        int tryCount = sc.nextInt();
        checkPositiveNumber(tryCount);
        return tryCount;
    }

    private void checkPositiveNumber(int tryCount) {
        if (tryCount <= 0) {
            throw new IllegalArgumentException("최소 한번 이상의 게임을 진행해야 합니다.");
        }
    }
}
