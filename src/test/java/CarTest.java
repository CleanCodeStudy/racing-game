import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CarTest {
    private Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void drawRacing() {
        car.repeatUpTo(5);
        assertThat(car.drawRacingRoad(), is("====="));
    }

    @Test
    public void testUpdate() throws Exception{
        Car car = new Car();
        Method method = car.getClass().getDeclaredMethod("updateLocationAccordingTo", int.class);
        Field field = car.getClass().getDeclaredField("location");

        method.setAccessible(true);
        field.setAccessible(true);

        int tryTimes = 3;
        for(int i=0; i<3 ; i++){
            method.invoke(car, 6);
        }

        assertThat(field.get(car), is(3));
    }
}