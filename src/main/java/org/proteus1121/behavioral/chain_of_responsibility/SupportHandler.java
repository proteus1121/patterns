package org.proteus1121.behavioral.chain_of_responsibility;

abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public SupportHandler setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public abstract void handleRequest(String request);
}
