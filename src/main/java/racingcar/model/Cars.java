package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public final class Cars {

    private final List<Car> carList;

    public Cars(List<String> carNames) {
        List<Car> carList = new ArrayList<>();

        for (String carName : carNames) {
            carList.add(new Car(carName));
        }

        this.carList = carList;
    }

    public List<Car> getCarList() {

        return new ArrayList<>(carList);
    }

    public int getSize() {
        return carList.size();
    }
}
