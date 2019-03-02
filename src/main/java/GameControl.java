import java.util.ArrayList;
import java.util.List;

public class GameControl { //like controller?
    RacingGame racingGame;
    Input input;

    public List<Car> makeCarList(String carNameString) {
        String[] carNames = carNameString.split(",");
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
        return cars;
    }

    public String runGame() {
        String carNameString = input.inputCarName();
        List<Car> cars = makeCarList(carNameString);
        int times = input.inputTimes();
        racingGame.init(cars, times);
        racingGame.start();
//        System.out.println(racingGame.AllCarsRoad()); return 형식으로 쓰지 않을 경우
        return racingGame.AllCarsRoad();
    }

}
