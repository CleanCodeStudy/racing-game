package racing.domain;

import racing.support.Engine;

public class Car {

    private final String name;
    private int location;

    public Car(String name) {
        this.name = name;
    }

    public void tryMoveWith(Engine engine) {
        if (engine.enough()) {
            location++;
        }
    }

    public int getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

}
