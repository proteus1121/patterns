package org.proteus1121.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

class ChatRoom implements ChatMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            // Сообщение отправляется всем пользователям, кроме отправителя
            if (user != sender) {
                user.receive(message);
            }
        }
    }
}