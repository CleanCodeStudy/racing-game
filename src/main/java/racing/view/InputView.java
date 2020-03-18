package racing.view;

import java.util.Scanner;

public class InputView {

    public static String askNumberOfCar() {
        System.out.println("자동차 대수를 입력하세요");
        return new Scanner(System.in).next();
    }

    public static String askCountOfMovement() {
        System.out.println("이동횟수를 입력하세요");
        return new Scanner(System.in).next();
    }
}
