package racing.domain;

import java.util.List;

public class Winners {
    private final List<String> names;

    public Winners(List<String> names) {
        this.names = names;
    }

    public String getName(int idx) {
        return names.get(idx);
    }

    public int size() {
        return names.size();
    }
}
