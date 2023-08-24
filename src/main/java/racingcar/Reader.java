package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Reader {

    public List<String> readCarNames() {
        Scanner scanner = new Scanner(System.in);

        return Arrays.stream(readLine()
                        .split(","))
                .collect(Collectors.toList());
    }

    public int readRoundsToPlay() {
        return Integer.parseInt(readLine());
    }
}
