package racingcar2.util;

import racingcar2.controller.GameController;
import racingcar2.service.CarService;
import racingcar2.view.GameView;

public class Container {

    private Reader reader;
    private Printer printer;
    private GameController gameController;
    private CarService carService;
    private GameView gameView;

    public Reader reader() {
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

    public GameController gameController() {
        if (gameController == null) {

            printer();
            reader();
            carService();
            gameView();

            gameController = new GameController(printer, reader, carService, gameView);
        }
        return gameController;
    }

    public CarService carService() {
        if (carService == null) {
            carService = new CarService();
        }
        return carService;
    }

    public GameView gameView() {
        if (gameView == null) {
            gameView = new GameView();
        }
        return gameView;
    }
}
