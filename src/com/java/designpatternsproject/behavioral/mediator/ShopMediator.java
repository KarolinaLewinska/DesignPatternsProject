package com.java.designpatternsproject.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShopMediator implements Mediator {
    private List<Client> clients;

    public ShopMediator() {
        this.clients = new ArrayList<>();
    }

    @Override
    public void addClient(Client client) {
        clients.add(client);
    }

    @Override
    public void sendReceipt(Client client) {
        if (client != null) {
            client.receiveReceipt();
        } else {
            System.out.println("Client not found");
        }
    }
}