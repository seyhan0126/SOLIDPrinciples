package org.server.SOLID.DependencyInversionExercise;

public class WebStore {
    private PaymentController controller;

    public WebStore() {
        this.controller = new PaymentController();
        controller.setPaymentMethod(new Skrill());
    }

    public void purchasePay(){
        controller.pay();
    }

}
