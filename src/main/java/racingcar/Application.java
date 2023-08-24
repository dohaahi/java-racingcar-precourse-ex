package racingcar;

import racingcar.controller.GameController;

public class Application {
    public static void main(String[] args) {

        Container container = new Container();

        GameController gameController = container.gameController();
        gameController.start();
    }
}
