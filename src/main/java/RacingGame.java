import java.util.List;

public class RacingGame { //like service
    private List<Car> cars;
    private int times;

    public void init(List<Car> cars, int tryCount) {
        this.times = tryCount;
        this.cars = cars;
    }

    public void start() {
        for (Car car : cars) {
            car.repeatUpTo(times);
        }
    }

    public String AllCarsRoad() {
        StringBuilder stringBuilder = new StringBuilder();
        for(Car car : cars){
            stringBuilder.append(car.drawRacingRoad());
        }
        return stringBuilder.toString();
    }

}
