package racingcar2;

import racingcar.Reader;
import racingcar2.controller.GameController;
import racingcar2.util.Container;

public class Application {
    public static void main(String[] args) {

        Container container = new Container();
        GameController gameController = container.gameController();

        gameController.start();
    }
}
