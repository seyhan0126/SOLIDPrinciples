package org.server.SOLID.LiskovSubstitution;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new ElectricCar("Mustang", 20);
        vehicle.speedUp();
        vehicle.slowDown();
        vehicle.fuel();
    }
}
