# 자동차 경주 게임

## 진행 방법

* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정

* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 자동차 경주 게임 기능 목록

### Car

- [x] 자동차 객체를 생성한다.
- [x] 4 이상의 값이 전달되었을 경우 자동차가 이동한다.
- [x] 자동차는 현재 위치를 반환할 수 있다.
- [x] 자동차의 이름은 5자리를 초과할 수 없다.

### inputView

- [x] 게임에 참여할 자동차 이름을 입력받는다.
- [x] 게임 시도할 횟수를 입력받는다.

### RacingGame

- [x] 게임을 진행한다.
- [x] 게임의 자동차 대수 또는 시도할 횟수에 음수를 전달하는 경우 예외를 throw 한다.
- [x] 게임 진행 후 우승자를 반환한다.

### ResultView

- [x] 게임 결과를 출력한다.