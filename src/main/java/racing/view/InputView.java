package racing.view;

import racing.domain.GameInfo;

import java.util.Scanner;

public class InputView {

    public static GameInfo askGameInfo() {
        return new GameInfo(askRacingOwners(), askRoundCount());
    }

    private static String askRacingOwners() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분.");
        return new Scanner(System.in).nextLine();
    }

    private static String askRoundCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        return new Scanner(System.in).nextLine();
    }
}
