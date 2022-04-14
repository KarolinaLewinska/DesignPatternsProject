package com.java.designpatternsproject.structural.composite;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public abstract class Card {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    protected String cardId;
    protected String creationDate;
    protected String validationDate;
    protected BigDecimal cardValue;

    public Card() {
        this.cardId = generateCardId();
        this.creationDate = setCreationDate();
        this.validationDate = setValidationDate();
        this.cardValue = BigDecimal.ZERO;
    }

    public abstract void printCardData();

    private String generateCardId() {
        return UUID.randomUUID().toString();
    }

    private String setCreationDate() {
        return DATE_TIME_FORMATTER.format(getNow());
    }

    private String setValidationDate() {
        return getNow().plusDays(365).format(DATE_TIME_FORMATTER);
    }

    private LocalDateTime getNow() {
        return LocalDateTime.now();
    }
}