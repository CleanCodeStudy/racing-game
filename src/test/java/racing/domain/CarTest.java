package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class CarTest {

    @DisplayName("Car의 위치대로 Track이 리턴된다")
    @Test
    void createTrack() throws NoSuchFieldException, IllegalAccessException {
        Car car = new Car();
        Field location = car.getClass().getDeclaredField("location");
        location.setAccessible(true);
        location.setInt(car, 5);

        assertThat(car.createTrack()).isEqualTo("-----");
    }


}
