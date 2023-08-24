package racingcar;

import racingcar.model.Cars;
import racingcar.view.GameView;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Printer {

    public void printReadCarNamesMessage() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void printMoveCountMessage() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public void printExecutionResult() {
//        throw new NotImplementedException();

    }

    public void printWinner() {
//        throw new NotImplementedException();
        System.out.println("최종 우승자 : ");
    }
}
