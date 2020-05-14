package racing.domain.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.domain.common.FixedNumberGenerator;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ParticipateCarsTest {
    @DisplayName("게임에 참여하는 Car 에게 이동을 지시하고 이름과 이동 결과의 Liatㄹ르 반환한다.")
    @Test
    void name1() {
        String[] namesOfCars = {"pobi", "crong"};
        ParticipateCars participateCars = new ParticipateCars(namesOfCars);
        List<CarResult> result = participateCars.moveCars(new FixedNumberGenerator());
        assertAll(
                () -> assertThat(result).usingFieldByFieldElementComparator()
                        .contains(new CarResult("pobi", 1)),
                () -> assertThat(result).usingFieldByFieldElementComparator()
                        .contains(new CarResult("crong", 0))
        );
    }
}