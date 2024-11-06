package org.proteus1121.behavioral.strategy;

class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Устанавливаем стратегию
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Выполняем оплату
    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("Payment strategy is not set.");
            return;
        }
        paymentStrategy.pay(amount);
    }
}