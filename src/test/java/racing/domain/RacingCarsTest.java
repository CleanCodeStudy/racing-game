package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RacingCarsTest {

    @DisplayName("입력된 레이싱카 이름 만큼 레이싱카가 생성되었는지 확인.")
    @Test
    public void getRacingCarsTest() {
        // given
        List<String> names = new ArrayList<>();
        names.add("nathan");
        names.add("hong");
        names.add("IU");
        RacingCars racingCars = new RacingCars(names);

        assertEquals(names.size(), racingCars.getRacingCars().size());
    }
}