package org.server.SOLID.SingleResponsibility;

import java.util.Scanner;

public class InputProcessor {
    public static Pair process() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number");
        String firstNumber = scanner.nextLine();

        System.out.println("Please enter the second number");
        String secondNumber = scanner.nextLine();

        return new Pair(firstNumber, secondNumber);
    }
}
