package org.server.SOLID.InterfaceSegregationExercise;

public class CEO implements ICEO {
    @Override
    public void makeDecision() {
        System.out.println("Making decisions...");
    }

    @Override
    public void addStocks() {
        System.out.println("Getting shares of the company as bonus...");
    }

    @Override
    public void addBonus() {
        System.out.println("Getting the bonus at the end of the year...");
    }

    @Override
    public void salary() {
        System.out.println("Getting the salary...");
    }
}
