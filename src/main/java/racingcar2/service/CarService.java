package racingcar2.service;

import racingcar2.model.Car;
import racingcar2.model.Cars;

import java.util.List;

public class CarService {

    public void moveCars(Cars cars, int maxRound) {
        List<Car> carList = cars.getCarList();

        for (Car car : carList) {
            moveCarTryMaxRound(car, maxRound);
        }
    }

    private void moveCarTryMaxRound(Car car,int maxRound) {
        for (int i = 0; i < maxRound; i++) {
            car.moveGreaterThanFour();
            car.savePosition(car.getPosition());
        }
    }
}
