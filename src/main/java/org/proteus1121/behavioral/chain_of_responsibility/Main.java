package org.proteus1121.behavioral.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        SupportHandler basic = new BasicSupport();
        SupportHandler technical = new TechnicalSupport();
        SupportHandler expert = new ExpertSupport();

        basic.setNextHandler(technical).setNextHandler(expert);

        System.out.println("Sending 'Basic' request:");
        basic.handleRequest("Basic");

        System.out.println("\nSending 'Technical' request:");
        basic.handleRequest("Technical");

        System.out.println("\nSending 'Expert' request:");
        basic.handleRequest("Expert");

        System.out.println("\nSending 'Unknown' request:");
        basic.handleRequest("Unknown");
    }
}