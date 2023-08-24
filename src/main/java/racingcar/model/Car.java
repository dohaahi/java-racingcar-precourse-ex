package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private final String name;
    private int position = 0;

    private List<Integer> positionHistory = new ArrayList<>();

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public List<Integer> getPositionHistory() {
        return positionHistory;
    }

    public void moveIfGreaterThanFour() {
        int randomNumber = pickRandomNumber();

        if (randomNumber >= 4) {
            position++;
        }

        positionHistory.add(position);
    }

    private int pickRandomNumber() {
        int picked = Randoms.pickNumberInRange(1, 9);
        return picked;
    }
}


// 랜덤 숫자 뽑기 -> 뽑은 숫자가 4보다 크면 움직임
// 매 회 움직인 만큼 콘솔에 출력
// 사용자가 입력한 횟수가되면 우승자 출력