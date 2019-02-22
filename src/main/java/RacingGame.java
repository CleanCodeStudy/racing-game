import java.util.List;

public class RacingGame {
    private List<Car> cars;
    private int times;

    public void init(List<Car> cars, int tryCount){
        this.times = tryCount;
        this.cars = cars;
    }

    public void start(){
        for(Car car: cars){
            car.repeatUpTo(times);
        }
    }

    public void print(){
        for(Car car: cars){
            System.out.println(car.drawRacingRoad());
        }
    }


}
