package racingcar.view;

import racingcar.model.Car;
import racingcar.model.Cars;

import java.util.ArrayList;
import java.util.List;

public class GameView {

    public void render(final Cars cars, final int maxRound) {
        System.out.println("실행 결과");

        // cars에서 car를 꺼내 결과 출력
        List<Car> carList = cars.getCarList();

        for (Car car : carList) {
            move(car, maxRound);

            List<String> positionList = moveResult(car);

            for (String s : positionList) {
                System.out.printf("%s : %s\n", car.getName(), s);
            }
        }

        // 최종 우승자 출력
        ArrayList<String> winner = new ArrayList<>();

        for (int i = 0; i < cars.getSize() - 1; i++) {
            if (carList.get(i).getPosition() <= carList.get(i + 1).getPosition()) {
                winner.add(carList.get(i + 1).getName());
                return;
            }
            winner.add(carList.get(i).getName());
        }


//        if (winner.size() != 1) {
//            System.out.print("최종 우승자: ");
//            for (String s : winner) {
//
//            }
//        }
        
        System.out.printf("최종 우승자 : %s", winner.get(0));

    }

    // maxRound까지 순회하며 move실행
    private void move(Car car, int maxRound) {
        for (int i = 0; i < maxRound; i++) {
            car.moveIfGreaterThanFour();
        }
    }


    // positionList를 순환하며 position을 stringList로 반환
    private List<String> moveResult(Car car) {
        List<String> stringPositionHistory = new ArrayList<>();

        List<Integer> positionHistory = car.getPositionHistory();

        for (Integer i : positionHistory) {
            String stringPosition = "";

            for (int j = 0; j < i; j++) {
                stringPosition += "-";
            }

            stringPositionHistory.add(stringPosition);
        }

        return stringPositionHistory;
    }
}
