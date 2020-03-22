package racing.view;

import java.util.Scanner;

public class InputView {

    public static int askNumberOfCar() {
        System.out.println("자동차 대수를 입력하세요");
        try {
            return Integer.parseInt(new Scanner(System.in).next());
        } catch (NumberFormatException ne) {
            throw new IllegalArgumentException("숫자가 아닌 값은 들어올 수 없습니다!");
        }
    }

    public static int askCountOfMovement() {
        System.out.println("이동횟수를 입력하세요");
        try {
            return Integer.parseInt(new Scanner(System.in).next());
        } catch (NumberFormatException ne) {
            throw new IllegalArgumentException("숫자가 아닌 값은 들어올 수 없습니다!");
        }
    }
}
