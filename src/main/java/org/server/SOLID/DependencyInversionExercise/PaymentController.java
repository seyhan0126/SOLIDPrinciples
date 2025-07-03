package org.server.SOLID.DependencyInversionExercise;
//high level modules
public class PaymentController {
    private PaymentMethod paymentMethod;

    public PaymentController() {}
    //we can change behavior at runtime
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay(){
        this.paymentMethod.pay();
    }
}
