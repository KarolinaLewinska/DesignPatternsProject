package com.java.designpatternsproject.structural.composite;

import java.math.BigDecimal;

public class EmployeeCard extends Card {
    private boolean isEmployeeCard;

    public EmployeeCard(BigDecimal cardValue) {
        this.cardValue = cardValue;
        setEmployeeCardType();
    }

    @Override
    void printCardData() {
        System.out.println("Card id: " + cardId + "\n"
                + "Creation date: " + creationDate + "\n"
                + "Validation date: " + validationDate + "\n"
                + "Card value: " + cardValue + "\n"
                + "Is employee card: " + isEmployeeCard + "\n");
    }

    private boolean setEmployeeCardType() {
        return isEmployeeCard = true;
    }
}