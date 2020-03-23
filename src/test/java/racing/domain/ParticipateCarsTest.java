package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.domain.common.FixedNumberGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ParticipateCarsTest {

    @DisplayName("게임에 참여하는 Car에게 이동을 지시하고 이동 결과를 반환한다")
    @Test
    void name() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car());
        cars.add(new Car());
        ParticipateCars participateCars = new ParticipateCars(cars);
        List<Integer> result = participateCars.tryMove(new FixedNumberGenerator());
        assertThat(result).isEqualTo(Arrays.asList(1, 0));
    }
}