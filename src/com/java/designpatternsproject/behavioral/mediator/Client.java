package com.java.designpatternsproject.behavioral.mediator;

public abstract class Client {
    public Receipt receipt;
    private Mediator mediator;
    private String nameAndSurname;
    private String email;
    private String address;

    public Client(Mediator mediator, String nameAndSurname, String email, String address, Receipt receipt) {
        this.mediator = mediator;
        this.nameAndSurname = nameAndSurname;
        this.email = email;
        this.address = address;
        this.receipt = receipt;
    }

    public abstract void receiveReceipt();

    public void sendReceipt(Client client) {
        mediator.sendReceipt(client);
    }
}