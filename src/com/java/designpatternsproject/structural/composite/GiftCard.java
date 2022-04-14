package com.java.designpatternsproject.structural.composite;

import java.math.BigDecimal;

public class GiftCard extends Card {
    private boolean isGiftCard;

    public GiftCard(BigDecimal cardValue) {
        this.cardValue = cardValue;
        setGiftCardType();
    }

    @Override
    void printCardData() {
        System.out.println("Card id: " + cardId + "\n"
                + "Creation date: " + creationDate + "\n"
                + "Validation date: " + validationDate + "\n"
                + "Card value: " + cardValue + "\n"
                + "Is gift card: " + isGiftCard + "\n");
    }

    private boolean setGiftCardType() {
        return isGiftCard = true;
    }
}