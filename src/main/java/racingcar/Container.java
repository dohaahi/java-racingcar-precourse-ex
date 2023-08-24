package racingcar;

import racingcar.controller.GameController;
import racingcar.view.GameView;

public class
Container {
    private Reader reader;
    private Printer printer;
    private GameView gameView;
    private GameController gameController;

    public Reader reader() {
        // 싱글톤처럼 만들기 위한 코드
        if (reader == null) {
            reader = new Reader();
        }

        return reader;
    }

    public Printer printer() {
        if (printer == null) {
            printer = new Printer();
        }

        return printer;
    }

    public GameView gameView() {
        if (gameView == null) {
            gameView = new GameView();
        }

        return gameView;
    }

    public GameController gameController() {
        if (gameController == null) {

            if (reader == null) {
                reader();
            }
            if (printer == null) {
                printer();
            }
            if (gameView == null) {
                gameView();
            }

            gameController = new GameController(reader, printer, gameView);
        }

        return gameController;
    }
}
