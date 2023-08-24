package racingcar2.model;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Car {

    private final String carName;
    private int position;

    private List<Integer> positionList = new ArrayList<>();

    public Car(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public int getPosition() {
        return position;
    }

    public List<Integer> getPositionList() {
        return positionList;
    }

    public void moveGreaterThanFour() {
        int pickRandomNumber = pickRandomNumber();

        if (pickRandomNumber >= 4) {
            position++;
        }

//        savePosition();
    }

    private int pickRandomNumber() {
        return pickNumberInRange(0, 9);
    }

    public void savePosition(int position) {
        positionList.add(position);
    }
}
