package org.server.SOLID.InterfaceSegregationExercise;

public interface IManager extends IEmployee {
    // managers
    public void hire();
    public void train();
    // CEO + managers
    public void addBonus();
}
