package racing.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RacingTurn {
    private final List<Integer> carDistances;

    public RacingTurn(List<Integer> carDistances) {
        this.carDistances = carDistances;
    }

    public List<Integer> getCarDistances() {
        return new ArrayList<>(carDistances);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RacingTurn that = (RacingTurn) o;
        return Objects.equals(carDistances, that.carDistances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carDistances);
    }
}
