import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class InputTest {

    @Test
    public void inputCarName() {
        Input input= new Input();

        String inputString = "pobi,crong,honux";
        InputStream in = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(in);

        assertEquals("pobi,crong,honux", input.inputCarName());
    }

    @Test
    public void inputTimes() {
        Input input= new Input();

        String inputInteger = "5";
        InputStream in = new ByteArrayInputStream(inputInteger.getBytes());
        System.setIn(in);

        assertEquals(5, input.inputTimes());
    }
}