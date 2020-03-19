package racing.util;

import racing.view.OutputView;

import java.util.Scanner;

public class InputHelper {

    private Scanner scanner;
    private OutputView outputView;

    public InputHelper(OutputView outputView) {
        this.outputView = outputView;
        this.scanner = new Scanner(System.in);
    }

    public int getCarNumbers() {
        outputView.printInputCarNumbersNotice();
        return scanner.nextInt();
    }

    public int getTotalGameTurns() {
        outputView.printInputGameTurnsNotice();
        return scanner.nextInt();
    }
}
