package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PositionTest {
    @Test
    @DisplayName("Position 가 객체의 동등 조건을 만족한다.")
    void createTest() {
        Position position = new Position(4);
        assertThat(position).isEqualTo(new Position(4));
    }

    @Test
    @DisplayName("음수가 전달되었을 때 Position 객체가 생성 시 예외가 발생한다.")
    void throwExceptionWhenNegativePosition() {
        assertThatThrownBy(() -> new Position(-4))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("음수가 전달되어 객체를 생성할 수 없습니다.");
    }

    @Test
    @DisplayName("현재 위치와 입력된 위치가 같을 때 true를 반환한다.")
    void isEqualPositionTest() {
        Position position = new Position(2);
        int orderPosition = 2;
        assertThat(position.isEqualPosition(orderPosition)).isTrue();
    }

    @Test
    @DisplayName("현재 위치와 입력된 위치 중 더 큰 위치를 반환한다.")
    void comparePositionTest() {
        Position position = new Position(2);
        int orderPosition = 3;
        assertThat(position.comparePosition(orderPosition)).isEqualTo(orderPosition);
    }

    @Test
    @DisplayName("increment 메서드가 Position의 value를 1 증가한 새로운 객체를 반환한다.")
    void incrementTest() {
        Position position = new Position(2);
        assertThat(position.increment()).isEqualTo(new Position(3));
    }

}
