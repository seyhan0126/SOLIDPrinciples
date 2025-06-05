package org.server.SOLID.SingleResponsibilityExercise;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = InputProcessor.getUserInput();

        Operation.sort(nums);

        Display.show(nums);
    }
}
