package com.java.designpatternsproject.structural.composite;

import java.math.BigDecimal;

public class ChristmasCard extends Card {
    private boolean isChristmasCard;

    public ChristmasCard(BigDecimal cardValue) {
        this.cardValue = cardValue;
        setChristmasCardType();
    }

    @Override
    void printCardData() {
        System.out.println("Card id: " + cardId + "\n"
                + "Creation date: " + creationDate + "\n"
                + "Validation date: " + validationDate + "\n"
                + "Card value: " + cardValue + "\n"
                + "Is christmas card: " + isChristmasCard + "\n");
    }

    private boolean setChristmasCardType() {
        return isChristmasCard = true;
    }
}