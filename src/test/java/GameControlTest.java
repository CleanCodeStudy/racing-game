import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GameControlTest {



    public String[] testCars = {"pobi","crong","honux"};

    @Test
    public void makeCarList() {
        GameControl gameControl = new GameControl();
        List<Car> cars = gameControl.makeCarList("pobi,crong,honux");
        for(int i=0; i<testCars.length; i++){
            //test를 위해서 get을 추가했음,,
            assertEquals(testCars[i], cars.get(i).getName());
        }
    }

    @Test
    public void runGame() { //전체 게임 실행. 단위 테스트가 아닌 것 같아서 망설여짐

    }
}