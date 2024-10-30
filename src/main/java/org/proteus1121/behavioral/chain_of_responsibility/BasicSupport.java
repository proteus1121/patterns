package org.proteus1121.behavioral.chain_of_responsibility;

class BasicSupport extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("Basic")) {
            System.out.println("Basic support team handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
