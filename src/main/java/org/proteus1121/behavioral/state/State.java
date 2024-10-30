package org.proteus1121.behavioral.state;

// Интерфейс состояния
public interface State {
    void insertCoin();
    void selectTicket();
    void cancel();
    void dispenseTicket();
}