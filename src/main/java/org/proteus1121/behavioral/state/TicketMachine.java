package org.proteus1121.behavioral.state;

import org.proteus1121.behavioral.state.states.CancelledState;
import org.proteus1121.behavioral.state.states.TicketPurchasedState;
import org.proteus1121.behavioral.state.states.TicketSelectedState;
import org.proteus1121.behavioral.state.states.WaitingForCoinState;

// Класс автомата для продажи билетов
public class TicketMachine {
    private State waitingForCoinState;
    private State ticketSelectedState;
    private State ticketPurchasedState;
    private State cancelledState;

    private State currentState;

    public TicketMachine() {
        waitingForCoinState = new WaitingForCoinState(this);
        ticketSelectedState = new TicketSelectedState(this);
        ticketPurchasedState = new TicketPurchasedState(this);
        cancelledState = new CancelledState(this);

        currentState = waitingForCoinState; // начальное состояние
    }

    // Методы для смены состояний
    public void setState(State state) {
        this.currentState = state;
    }

    public State getWaitingForCoinState() {
        return waitingForCoinState;
    }

    public State getTicketSelectedState() {
        return ticketSelectedState;
    }

    public State getTicketPurchasedState() {
        return ticketPurchasedState;
    }

    public State getCancelledState() {
        return cancelledState;
    }

    // Методы, делегирующие поведение текущему состоянию
    public void insertCoin() {
        currentState.insertCoin();
    }

    public void selectTicket() {
        currentState.selectTicket();
    }

    public void cancel() {
        currentState.cancel();
    }

    public void dispenseTicket() {
        currentState.dispenseTicket();
    }
}