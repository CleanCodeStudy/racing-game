import java.util.ArrayList;
import java.util.List;

public class GameControll { //여러개의 레이싱 게임을 컨트롤 할 수 있다.
    RacingGame racingGame;

    public List<Car> makeCarList(int carNumber){
        List<Car> cars = new ArrayList<>();
        for(int i=0; i<carNumber; i++){
            cars.add(new Car());
        }
        return cars;
    }

    public void runGame(int carNumber, int times){
        racingGame.init(makeCarList(carNumber),times);
        racingGame.start();
        racingGame.print();
    }
}
