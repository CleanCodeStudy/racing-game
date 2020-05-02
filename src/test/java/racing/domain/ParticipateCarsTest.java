package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.domain.common.FixedNumberGenerator;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ParticipateCarsTest {
    @DisplayName("게임에 참여하는 Car 에게 이동을 지시하고 이름과 이동 결과의 Map을 반환한다.")
    @Test
    void name1() {
        String[] namesOfCars = {"pobi", "crong"};
        ParticipateCars participateCars = new ParticipateCars(namesOfCars);
        Map<String, Integer> result = participateCars.tryMoveWithName(new FixedNumberGenerator());
        assertAll(
                () -> assertThat(result).containsEntry("pobi", 1),
                () -> assertThat(result).containsEntry("crong", 0)
        );
    }
}