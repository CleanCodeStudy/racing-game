package racing.view;

public class InputCount {
    private int count;

    public InputCount(int count) {
        checkPositive(count);
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    private void checkPositive(int count) {
        if (isNotPositive(count)) {
            throw new IllegalArgumentException("입력하신 값이 양수가 아닙니다.");
        }
    }

    private boolean isNotPositive(int count) {
        return count <= 0;
    }
}
