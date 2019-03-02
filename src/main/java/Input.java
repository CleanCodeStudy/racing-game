import java.util.Scanner;

public class Input { //like mapper

    Scanner scanner = new Scanner(System.in);

    public String inputCarName(){
        System.out.println("차의 이름을 입력해주세요");
        String carNames = scanner.next();
        return carNames;
    }

    public int inputTimes(){
        System.out.println("시도할 회수는 몇회인가요?");
        int times = scanner.nextInt();
        return times;
    }
}
