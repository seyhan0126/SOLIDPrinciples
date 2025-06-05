package org.server.SOLID.InterfaceSegregationExercise;

public class Main {
    public static void main(String[] args) {
        ICEO ceo = new CEO();
        ceo.addBonus();
        ceo.addStocks();
        ceo.makeDecision();
        ceo.salary();
    }
}
