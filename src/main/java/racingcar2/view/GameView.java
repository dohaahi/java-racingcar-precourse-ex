package racingcar2.view;

import racingcar2.model.Cars;
import racingcar2.util.Printer;



public class GameView {

    // 결과 출력
    public void render(Printer printer,Cars cars, int maxRound) {

        printer.printMoveResult(cars, maxRound);
        printer.printWinner(cars);
    }
}
