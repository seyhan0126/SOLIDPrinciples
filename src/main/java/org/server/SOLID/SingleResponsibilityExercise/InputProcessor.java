package org.server.SOLID.SingleResponsibilityExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputProcessor {
    public static final int THRESHOLD = 5;

    public static List<Integer> getUserInput() {
        System.out.println("Enter 5 valid integers in the range [0, 10]");
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (list.size() < THRESHOLD) {
            String input = scanner.nextLine();
            if (!Validator.isValid(input)) continue;
            list.add(Integer.valueOf(input));
        }
        scanner.close();
        return list;
    }
}
