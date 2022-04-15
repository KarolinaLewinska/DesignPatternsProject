package com.java.designpatternsproject.creational.factory;

public class ShopDE extends Shop {
    private String taxIdNumber;

    public String getIdNumber() {
        return taxIdNumber;
    }

    public void setIdNumber(String taxIdNumber) {
        this.taxIdNumber = taxIdNumber;
    }
}