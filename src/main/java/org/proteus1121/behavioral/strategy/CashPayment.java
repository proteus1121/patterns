package org.proteus1121.behavioral.strategy;

class CashPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " in cash.");
    }
}