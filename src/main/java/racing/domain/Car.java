package racing.domain;

import java.util.Objects;

public class Car {
    private int drivenDistance = 0;
    private Mover mover;
    private String name;

    public Car(String name, Mover mover) {
        verifyName(name);
        this.name = name;
        this.mover = mover;
    }

    public void move() {
        if (mover.canMove()) {
            drivenDistance++;
        }
    }

    public int getDrivenDistance() {
        return drivenDistance;
    }

    public String getName() {
        return name;
    }

    private void verifyName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("자동차의 이름은 공백일 수 없음.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return drivenDistance == car.drivenDistance &&
                Objects.equals(mover, car.mover);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drivenDistance, mover);
    }
}
