package com.java.designpatternsproject.behavioral.mediator;

public class OrdinaryClient extends Client {
    public OrdinaryClient(Mediator mediator, String nameAndSurname, String email, String address, Receipt receipt) {
        super(mediator, nameAndSurname, email, address, receipt);
    }

    @Override
    public void receiveReceipt() {
        receipt.extraDiscountPercent = 5;
        System.out.println("Receipt:\n" + "Purchased products:");
        receipt.products.forEach(System.out::println);
        System.out.println("Amount due: " + receipt.totalCost + " zł");
        System.out.println("Extra % discount on your next purchases: " + receipt.extraDiscountPercent);
    }
}