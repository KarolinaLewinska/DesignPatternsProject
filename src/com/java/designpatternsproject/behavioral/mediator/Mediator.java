package com.java.designpatternsproject.behavioral.mediator;

public interface Mediator {
    void addClient(Client client);
    void sendReceipt(Client client);
}