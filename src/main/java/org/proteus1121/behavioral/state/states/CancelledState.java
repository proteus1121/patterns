package org.proteus1121.behavioral.state.states;

import org.proteus1121.behavioral.state.State;
import org.proteus1121.behavioral.state.TicketMachine;

// Класс состояния "Отмена операции"
public class CancelledState implements State {
    private TicketMachine machine;

    public CancelledState(TicketMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please start over by inserting a coin.");
        machine.setState(machine.getWaitingForCoinState());
    }

    @Override
    public void selectTicket() {
        System.out.println("Operation cancelled. Please start over.");
    }

    @Override
    public void cancel() {
        System.out.println("Already cancelled.");
    }

    @Override
    public void dispenseTicket() {
        System.out.println("Operation cancelled. No ticket dispensed.");
    }
}
