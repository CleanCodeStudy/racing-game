package racing.view;

public class RoundView {

    StringBuilder roundResult;

    public void initRoundView(StringBuilder roundResult) {
        this.roundResult = roundResult;
    }

    public void printCurrentRoundView() {
        System.out.println(roundResult);
    }
}
