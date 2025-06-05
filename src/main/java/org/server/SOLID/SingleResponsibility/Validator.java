package org.server.SOLID.SingleResponsibility;

public class Validator {
    public static boolean isValid(Pair pair) {

        String first = pair.getFirst();
        String second = pair.getSecond();

        try {
            Integer.parseInt(first);
        }
        catch (NumberFormatException e) {
            System.out.println("first integer is not an integer");
            return false;
        }

        try {
            Integer.parseInt(second);
        }
        catch (NumberFormatException e) {
            System.out.println("second integer is not an integer");
            return false;
        }

        return true;
    }
}
