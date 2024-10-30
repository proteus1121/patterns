package org.proteus1121.behavioral.mediator;

interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}