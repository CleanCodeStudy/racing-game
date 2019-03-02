import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RacingGameTest {

    private RacingGame racingGame;

    @Before
    public void setUp() throws Exception {
        racingGame = new RacingGame();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGame() {
//        racingGame.init(4, 10);
        racingGame.start();
//        racingGame.print();
    }
}