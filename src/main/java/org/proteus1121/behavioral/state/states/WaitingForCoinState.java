package org.proteus1121.behavioral.state.states;

import org.proteus1121.behavioral.state.State;
import org.proteus1121.behavioral.state.TicketMachine;

// Класс состояния "Ожидание монеты"
public class WaitingForCoinState implements State {
    private TicketMachine machine;

    public WaitingForCoinState(TicketMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted. You can now select a ticket.");
        machine.setState(machine.getTicketSelectedState());
    }

    @Override
    public void selectTicket() {
        System.out.println("Please insert a coin first.");
    }

    @Override
    public void cancel() {
        System.out.println("No operation to cancel.");
    }

    @Override
    public void dispenseTicket() {
        System.out.println("Please insert a coin and select a ticket.");
    }
}