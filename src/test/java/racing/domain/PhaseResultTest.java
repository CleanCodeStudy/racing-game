package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

        PhaseResult phaseResult = new PhaseResult(moveResult);

        List<String> leads = phaseResult.getCurrentLeads();

        assertAll(
                () -> assertThat(leads.size()).isEqualTo(1),
                () -> assertThat(leads.get(0)).isEqualTo("pobi")
        );
    }
}