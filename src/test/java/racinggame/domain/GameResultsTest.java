package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GameResultsTest {

    @Test
    @DisplayName("Cars 객체를 전달하여 GameResults 객체가 정상 생성된다.")
    void initTest() {
        GameResults gameResults = initGameResults();
        assertThat(gameResults).isNotNull();
    }

    @Test
    @DisplayName("carCount 메서드가 게임 결과에 저장된 게임 참여 자동차 대수를 반환한다.")
    void carCountTest() {
        GameResults gameResults = initGameResults();
        assertThat(gameResults.carCount()).isEqualTo(3);
    }

    @Test
    @DisplayName("getGameResultCarPositionByIndex 메서드가 게임 결과에 저장된 자동차 위치를 반환한다.")
    void getGameResultCarPositionByIndexTest() {
        List<String> carNames = List.of("자동차1", "자동차2", "자동차3");
        Cars cars = new Cars(carNames);
        int correctMoveNumber = 5;
        cars.getCarList().get(0).move(correctMoveNumber);
        GameResults gameResults = new GameResults(cars);
        assertThat(gameResults.getGameResultCarPositionByIndex(0)).isOne();
        assertThat(gameResults.getGameResultCarPositionByIndex(1)).isZero();
        assertThat(gameResults.getGameResultCarPositionByIndex(2)).isZero();
    }

    private GameResults initGameResults() {
        List<String> carNames = List.of("자동차1", "자동차2", "자동차3");
        return new GameResults(new Cars(carNames));
    }
}