package org.server.SOLID.DependencyInversionExercise;
//low level modules
public class PayPal implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Paying with PayPal...");
    }
}
