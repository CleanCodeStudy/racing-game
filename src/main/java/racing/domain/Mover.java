package racing.domain;

public interface Mover {

    int moveResult();

    enum Status {
        GO_FORWARD(1),
        GO_NOTHING(0);

        private int value;

        Status(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
