package com.java.designpatternsproject.creational.factory;

public class ShopManagerDE extends ShopManager {
    @Override
    public void showShopData(Shop shop) {
        ShopDE shopDE = (ShopDE) shop;

        System.out.println("German shop data");
        System.out.println("Address: " + shopDE.getAddress() + "\n"
            + "Phone number: " + shopDE.getPhoneNumber() + "\n" +
            "Email: " + shopDE.getEmail() + "\n" +
            "Main currency: " + shopDE.getMainCurrency() + "\n" +
            "City: " + shopDE.getCity() + "\n" +
            "Shop code: " + shopDE.getShopCode() + "\n"
            + "Tax id: " + shopDE.getIdNumber() + "\n");
    }
}