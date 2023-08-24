package racingcar2.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Reader {

    public List<String> readCarNames() {

        List<String> carNames = Arrays.stream(readLine()
                        .split(","))
                .collect(Collectors.toList());

        validateCarName(carNames);
        return carNames;
    }

    public void validateCarName(List<String> carNames) {
        for (String carName : carNames) {
            if (carName.length() > 5) {
                throw new IllegalArgumentException();
            }
        }
    }

    public int readTryTime() {
        return Integer.parseInt(readLine());
    }
}
