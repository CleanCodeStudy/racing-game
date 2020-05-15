package racing.domain;

import java.util.ArrayList;
import java.util.List;

public class RoundsPosition {

    private final List<Integer> positions = new ArrayList<>();

    public RoundsPosition() {
        positions.add(1);
    }

    public void addPosition(int position) {
        positions.add(position);
    }

    public Integer peek() {
        if (positions.isEmpty()) {
            return null;
        }

        return positions.get(positions.size()-1);
    }

    public Integer getRoundPosition(int round) {
        if (positions.isEmpty()) {
            return null;
        }

        return positions.get(round);
    }
}
