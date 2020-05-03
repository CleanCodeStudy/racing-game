package racing.view;

public class InputCount {
    private int count;

    public InputCount(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("입력하신 값이 양수가 아닙니다.");
        }
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
