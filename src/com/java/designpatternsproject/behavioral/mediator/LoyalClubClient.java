package com.java.designpatternsproject.behavioral.mediator;

import java.math.BigDecimal;

public class LoyalClubClient extends Client {
    public LoyalClubClient(Mediator mediator, String nameAndSurname, String email, String address, Receipt receipt) {
        super(mediator, nameAndSurname, email, address, receipt);
    }

    @Override
    public void receiveReceipt() {
        receipt.extraDiscountPercent = 15;
        System.out.println("Receipt:\n" + "Purchased products:");
        receipt.products.forEach(System.out::println);
        System.out.println("Amount due: " + receipt.totalCost + " zł");
        countLoyaltyPoints();
        System.out.println("Extra % discount on your next purchases: " + receipt.extraDiscountPercent);
    }

    private void countLoyaltyPoints() {
        BigDecimal POINT_PER_ONE_ZLOTY = new BigDecimal("0.5");
        receipt.loyalPoints = receipt.totalCost.multiply(POINT_PER_ONE_ZLOTY);
        System.out.println("Earned loyalty points: " + receipt.loyalPoints);
    }
}