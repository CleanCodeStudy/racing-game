package racing.domain;

public class Car {

    private int drivenDistance = 0;

    private Mover mover = new Mover();

    public void move() {
        drivenDistance += mover.moveResult();
    }

    public int getDrivenDistance() {
        return drivenDistance;
    }

}
