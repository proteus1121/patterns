package org.proteus1121.behavioral.chain_of_responsibility;

// Обработчик технической поддержки
class TechnicalSupport extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("Technical")) {
            System.out.println("Technical support team handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
