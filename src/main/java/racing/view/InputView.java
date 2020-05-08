package racing.view;

import java.util.Scanner;

public class InputView {
    private String carCounts;
    private String tryCounts;

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        carCounts = sc.nextLine();
        System.out.println("시도할 횟수는 몇 회 인가요?");
        tryCounts = sc.nextLine();
    }

    public String getCarCounts() {
        return carCounts;
    }

    public String getTryCounts() {
        return tryCounts;
    }
}
