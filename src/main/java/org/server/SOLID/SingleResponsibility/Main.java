package org.server.SOLID.SingleResponsibility;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Application");

        Pair pair = InputProcessor.process();


        if (!Validator.isValid(pair)){
            System.out.println("Invalid input");
            return;
        }
        int firstNumberInt = Integer.valueOf(pair.getFirst());
        int secondNumberInt = Integer.valueOf(pair.getSecond());

        int result = Operation.add(firstNumberInt, secondNumberInt);

        System.out.println("The result is: " + result);
        System.out.println("End of the program");
    }
}