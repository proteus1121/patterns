package org.proteus1121.behavioral.strategy;

class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolder;

    public CreditCardPayment(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card. Card Number: " + cardNumber);
    }
}