package org.proteus1121.behavioral.strategy;

public class StrategyPatternExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Оплата кредитной картой
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe"));
        cart.checkout(100);

        // Оплата через PayPal
        cart.setPaymentStrategy(new PayPalPayment("john@example.com"));
        cart.checkout(200);

        // Оплата наличными
        cart.setPaymentStrategy(new CashPayment());
        cart.checkout(50);
    }
}