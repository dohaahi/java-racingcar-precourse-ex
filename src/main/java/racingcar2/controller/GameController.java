package racingcar2.controller;

import racingcar2.model.Cars;
import racingcar2.service.CarService;
import racingcar2.util.Printer;
import racingcar2.util.Reader;
import racingcar2.view.GameView;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    private final Printer printer;
    private final Reader reader;
    private final CarService carService;
    private final GameView gameView;

    public GameController(Printer printer, Reader reader, CarService carService, GameView gameView) {
        this.printer = printer;
        this.reader = reader;
        this.carService = carService;
        this.gameView = gameView;
    }

    public void start() {
        // -입력 안내 메세지 출력
        // 게임을 실행할 자동차 이름을 ','를 기준으로 입력 받음
        printer.printCarNameMessage();

        List<String> carNames = validateCarNames();

        Cars cars = new Cars(carNames);


        //- 입력 안내 메세지 출력
        // 게임 실행할 횟수 입력 받음
        printer.printTryTimeMessage();
        int maxRound = reader.readTryTime();

        carService.moveCars(cars, maxRound);
        gameView.render(printer, cars, maxRound);
    }

    private List<String> validateCarNames() {
        List<String> carNames = new ArrayList<>();

        try {
             carNames = reader.readCarNames();

        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }
        return carNames;

    }


}
