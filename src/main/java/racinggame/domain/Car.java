package racinggame.domain;

import racinggame.domain.strategy.MoveStrategy;

public class Car {
    private static final int MAXIMUM_CAR_NAME_LENGTH = 5;
    private static final int DEFAULT_POSITION = 0;

    private final String name;
    private Position position;

    private Car(String name, int position) {
        this(name, new Position(position));
    }

    private Car(String name, Position position) {
        validateCarNameLength(name);
        this.name = name;
        this.position = position;
    }

    public static Car create(String name) {
        return new Car(name, DEFAULT_POSITION);
    }

    private void validateCarNameLength(String name) {
        if (name.length() > MAXIMUM_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차의 이름은 " + MAXIMUM_CAR_NAME_LENGTH + "자리를 초과할 수 없습니다.");
        }
    }

    public int getPosition() {
        return position.getValue();
    }

    public String getName() {
        return name;
    }

    public void move(MoveStrategy moveStrategy) {
        if (moveStrategy.isMoveable()) {
            position = position.increment();
        }
    }

    public boolean isEqualPosition(int otherPosition) {
        return position.isEqualPosition(otherPosition);
    }

    public int comparePosition(int otherPosition) {
        return position.comparePosition(otherPosition);
    }
}
