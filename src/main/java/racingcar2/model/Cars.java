package racingcar2.model;


import java.util.ArrayList;
import java.util.List;

public class Cars {
    List<Car> carList;

    public Cars(List<String> carNames) {
        ArrayList<Car> carList = new ArrayList<>();

        for (String carName : carNames) {
            Car car = new Car(carName);
            carList.add(car);
        }

        this.carList = carList;
    }

    public int getSize() {
        return carList.size();
    }

    public List<Car> getCarList() {
        return carList;
    }
}
