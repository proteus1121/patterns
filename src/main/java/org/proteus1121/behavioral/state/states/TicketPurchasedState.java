package org.proteus1121.behavioral.state.states;

import org.proteus1121.behavioral.state.State;
import org.proteus1121.behavioral.state.TicketMachine;

// Класс состояния "Билет куплен"
public class TicketPurchasedState implements State {
    private TicketMachine machine;

    public TicketPurchasedState(TicketMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Transaction already in progress. Please wait for ticket.");
    }

    @Override
    public void selectTicket() {
        System.out.println("Ticket already selected.");
    }

    @Override
    public void cancel() {
        System.out.println("Cannot cancel, ticket is being dispensed.");
    }

    @Override
    public void dispenseTicket() {
        System.out.println("Ticket dispensed. Thank you!");
        machine.setState(machine.getWaitingForCoinState());
    }
}