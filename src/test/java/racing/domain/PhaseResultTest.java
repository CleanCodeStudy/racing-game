package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.domain.car.CarResult;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PhaseResultTest {
    @DisplayName("PhaseResult의 getCurrentLead 메소드는 현재 선두의 이름을 List의 형태로 반환한다. ")
    @Test
    void name1() {
        Map<String, Integer> moveResult = new LinkedHashMap<>();
        moveResult.put("pobi", 1);
        moveResult.put("crong", 0);

        List<CarResult> carResults = Arrays.asList(new CarResult("pobi", 1)
                , new CarResult("crong", 0)
                , new CarResult("horox", 1));

        PhaseResult phaseResult = new PhaseResult(carResults);

        List<String> leads = phaseResult.getCurrentLeads();

        assertAll(
                () -> assertThat(leads.size()).isEqualTo(2),
                () -> assertThat(leads).containsExactly("pobi", "horox")
        );
    }
}