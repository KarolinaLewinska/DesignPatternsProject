package com.java.designpatternsproject.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCard extends Card {
    private  List<Card> cardsList;

    public ShoppingCard() {
        this.cardsList = new ArrayList<>();
    }

    @Override
    public void printCardData() {
        cardsList.forEach(Card::printCardData);
    }

    public void addCardToList(Card card) {
        cardsList.add(card);
    }

    public void removeCardFromList(Card card) {
        cardsList.remove(card);
    }
}