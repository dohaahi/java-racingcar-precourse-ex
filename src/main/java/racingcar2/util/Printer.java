package racingcar2.util;

import racingcar2.model.Car;
import racingcar2.model.Cars;

import java.util.ArrayList;
import java.util.List;

public class Printer {

    public void printCarNameMessage() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void printTryTimeMessage() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public void printMoveResult(Cars cars, int maxRound) {
        System.out.println("실행 결과");

        List<Car> carList = cars.getCarList();

        for (int i = 0; i < maxRound; i++) {
            for (Car car : carList) {
                String stringPosition = convertPositionToString(car.getPositionList().get(i));
                System.out.printf("%s : %s\n", car.getCarName(), stringPosition);
            }
            System.out.println();
        }
    }

    private String convertPositionToString(int position) {
        String stringPosition = "";

        for (int i = 0; i < position; i++) {
            stringPosition += "-";
        }

        return stringPosition;
    }

    public void printWinner(Cars cars) {
        List<String> winner = findWinner(cars);

        if (winner.size() == 1) {
            System.out.printf("최종 우승자 : %s\n", winner.get(0));
            return;
        }

        System.out.printf("최종 우승자 : ");
        for (int i = 0; i < winner.size() - 1; i++) {
            System.out.printf("%s, ", winner.get(i));
        }
        System.out.printf("%s", winner.get(winner.size() - 1));

    }

    private List<String> findWinner(Cars cars) {
        ArrayList<String> winnerList = new ArrayList<>();
        List<Car> carList = cars.getCarList();

        for (int i = 0; i < cars.getSize() - 1; i++) {
            // position이 크면 winnerList에 저장
            if (carList.get(i).getPosition() <= carList.get(i + 1).getPosition()) {
                winnerList.add(carList.get(i + 1).getCarName());
            } else {
                winnerList.add(carList.get(i).getCarName());
            }
        }
        return winnerList;
    }
}
