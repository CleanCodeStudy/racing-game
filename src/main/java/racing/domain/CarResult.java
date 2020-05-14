package racing.domain;


public class CarResult implements Comparable {
    private static final int COMPARE_EQUAL = 0;
    private static final int COMPARE_SMALL = -1;
    private String name;
    private int distance;

    public CarResult(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public int compareTo(Object o) {
        CarResult target = (CarResult) o;

        int compare = Integer.compare(target.distance, this.distance);
//
//        if (compare == COMPARE_EQUAL) {
//            return COMPARE_SMALL;
//        }

        return compare;
    }
}
