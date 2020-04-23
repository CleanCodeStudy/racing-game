package racing.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputHelper {
    private Scanner scanner;
    private OutputView outputView;

    public InputHelper(OutputView outputView) {
        this.outputView = outputView;
        this.scanner = new Scanner(System.in);
    }

    public int getTotalGameTurns() {
        outputView.printInputGameTurnsNotice();
        return scanner.nextInt();
    }

    public List<String> getCarNames() {
        outputView.printInputCarNamesNotice();
        return Arrays.asList(scanner.nextLine().split(","));
    }
}