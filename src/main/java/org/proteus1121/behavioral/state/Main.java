package org.proteus1121.behavioral.state;

public class Main {
    public static void main(String[] args) {
        TicketMachine machine = new TicketMachine();

        System.out.println("Starting ticket purchase process:");
        machine.insertCoin();
        machine.selectTicket();
        machine.dispenseTicket();

        System.out.println("\nCancelling ticket purchase process:");
        machine.insertCoin();
        machine.cancel();
    }
}