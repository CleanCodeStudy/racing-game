package racing;

import java.util.Scanner;

public class InputHelper {

    private Scanner scanner = new Scanner(System.in);

    public int getCarNumbers() {
        return scanner.nextInt();
    }

    public int getTotalGameTurns() {
        return scanner.nextInt();
    }
}
