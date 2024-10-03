package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GameRoundsTest {

    @Test
    @DisplayName("getRoundCount 메서드가 게임 라운드 수를 반환한다.")
    void getRoundCountTest() {
        GameRounds gameRounds = initGameRounds();
        assertThat(gameRounds.getRoundCount()).isOne();
    }

    @Test
    @DisplayName("getCarPosition 메서드가 특정 라운드의 특정 자동차 위치를 반환한다.")
    void getCarPositionTest() {
        List<String> carNames = List.of("자동차1", "자동차2", "자동차3");
        Cars cars = new Cars(carNames);
        int correctMoveNumber = 5;
        cars.getCarList().get(0).move(correctMoveNumber);
        cars.getCarList().get(0).move(correctMoveNumber);
        GameResults gameResults = new GameResults(cars);
        GameRounds gameRounds = new GameRounds();
        gameRounds.save(gameResults);
        assertThat(gameRounds.getCarPosition(0, 0)).isEqualTo(2);
    }

    private GameRounds initGameRounds() {
        GameRounds gameRounds = new GameRounds();
        gameRounds.save(initGameResults());
        return gameRounds;
    }

    private GameResults initGameResults() {
        List<String> carNames = List.of("자동차1", "자동차2", "자동차3");
        return new GameResults(new Cars(carNames));
    }

}