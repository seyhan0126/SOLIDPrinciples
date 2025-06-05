package org.server.SOLID.LiskovSubstitution;

public class ElectricCar extends Vehicle{
    public ElectricCar(String type, int age) {
        super(type, age);
    }

    @Override
    protected void speedUp() {
        System.out.println("Electric cars is speeding up...");
    }

    @Override
    protected void slowDown() {
        System.out.println("Electric cars is slowing down...");
    }

    @Override
    public void fuel() {
        System.out.println("Electric cars is being charged...");
    }
}
