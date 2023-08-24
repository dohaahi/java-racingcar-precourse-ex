package racingcar.controller;

import racingcar.model.Cars;
import racingcar.Printer;
import racingcar.Reader;
import racingcar.view.GameView;

import java.util.List;

public class GameController {

    private final Reader reader;
    private final Printer printer;
    private final GameView gameView;

    public GameController(
            final Reader reader,
            final Printer printer,
            final GameView gameView
    ) {
        this.reader = reader;
        this.printer = printer;
        this.gameView = gameView;
    }

    // [레이어드(계층) 아키텍쳐] - API 서버 기본 구조, 대체로 JSON 형태로 데이터 응답 내보
    // controller - 사용자의 요청 및 응답을 처리 (사용자가 입력한 값을 검증) + service에 실제 로직 처리 위임
    // service - 어플리케이션의 고유 로직
    // repository - DB 접근 + 읽기, 쓰기 처리

    // [MVC 패턴] - html을 body에 넣어서 응답
    // controller - 요청 처리 및 검증, 서비스 계층 호출 -> 서비스가 데이터를 처리해줌 // 기존 controller가 해준 응답을 view가 해줌 -> 기능이 반으로 쪼개짐
    // 서비스:  move를 할 때마다 변한 포지션을 갖고 있음
    // model - 렌더링할 때 필요한 데이터(서비스에서 처리됨)
    // view - 처리된 데이터 모델을 받아서 렌더링 및 응답

    public void start() {
        // 입력 받기
        printer.printReadCarNamesMessage();
        List<String> carNames = reader.readCarNames();
        Cars cars = new Cars(carNames);

        printer.printMoveCountMessage();
        int maxRound = reader.readRoundsToPlay();

        gameView.render(cars, maxRound);
    }
}

/*
    UserController getUser
    1. 사용자가 요청을 보냄(1번의 입력)
    2. DB에 사용자가 보낸 요청 검증 및 데이터 가져오기(1입력 1출력)
    3. 사용자에게 DB에서 가져온 사용자 정보 보냄(1번의 출력)
 */
