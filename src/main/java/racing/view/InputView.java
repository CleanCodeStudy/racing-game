package racing.view;

import java.util.Scanner;

public class InputView {

    public static String askNameOfCar() {
        System.out.println("경주할 자동차 이름을 입력하세요. 이름은 쉼표를 기준으로 구분.");
        return new Scanner(System.in).nextLine();
    }

    public static String askCountOfMovement() {
        System.out.println("이동횟수를 입력하세요");
        return new Scanner(System.in).next();
    }
}
