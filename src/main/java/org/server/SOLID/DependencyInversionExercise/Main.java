package org.server.SOLID.DependencyInversionExercise;

public class Main {
    public static void main(String[] args) {
        WebStore store = new WebStore();
        store.purchasePay();
    }
}
