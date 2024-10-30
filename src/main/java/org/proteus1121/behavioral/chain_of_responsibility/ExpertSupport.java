package org.proteus1121.behavioral.chain_of_responsibility;

// Обработчик экспертной поддержки
class ExpertSupport extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("Expert")) {
            System.out.println("Expert support team handled the request.");
        } else {
            System.out.println("Request could not be handled.");
        }
    }
}