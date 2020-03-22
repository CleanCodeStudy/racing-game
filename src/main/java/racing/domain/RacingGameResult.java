package racing.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RacingGameResult {
    private final Map<Integer, List<Integer>> gameResults;

    public RacingGameResult(Map<Integer, List<Integer>> gameResults) {
        this.gameResults = gameResults;
    }

    public List<Integer> getResultByAttempt(int attemptNumber) {
        validateAttemptSize(attemptNumber);
        return gameResults.get(attemptNumber);
    }

    public List<List<Integer>> getWholeResult() {
        List<List<Integer>> wholeResult = new ArrayList<>();

        for (int i = 1; i <= gameResults.size(); i++) {
            wholeResult.add(getResultByAttempt(i));
        }

        return wholeResult;
    }

    private void validateAttemptSize(int attemptNumber) {
        if (attemptNumber < 1) {
            throw new IllegalArgumentException(String.format("요청한 결과 번호가 1 보다 작습니다. - %s", attemptNumber));
        }

        if (attemptNumber > gameResults.size()) {
            throw new IllegalArgumentException(String.format("요청한 결과 번호가 총 시도횟수 보다 큽니다. - %s", attemptNumber));
        }
    }

}
