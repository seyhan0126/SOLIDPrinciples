package org.server.SOLID.SingleResponsibilityExercise;

import java.util.List;

public class Display {
    public static void show(List<Integer> list) {
        for(int num : list) {
            System.out.print(num + " ");
        }
    }
}
