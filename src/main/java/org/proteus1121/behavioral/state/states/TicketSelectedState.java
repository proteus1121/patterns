package org.proteus1121.behavioral.state.states;

import org.proteus1121.behavioral.state.State;
import org.proteus1121.behavioral.state.TicketMachine;

// Класс состояния "Билет выбран"
public class TicketSelectedState implements State {
    private TicketMachine machine;

    public TicketSelectedState(TicketMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted. Please select a ticket.");
    }

    @Override
    public void selectTicket() {
        System.out.println("Ticket selected. Dispensing ticket...");
        machine.setState(machine.getTicketPurchasedState());
    }

    @Override
    public void cancel() {
        System.out.println("Cancelling operation. Returning to waiting for coin.");
        machine.setState(machine.getCancelledState());
    }

    @Override
    public void dispenseTicket() {
        System.out.println("Please select a ticket first.");
    }
}