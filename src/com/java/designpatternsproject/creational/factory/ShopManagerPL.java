package com.java.designpatternsproject.creational.factory;

public class ShopManagerPL implements ShopManager {
    @Override
    public void showShopData(Shop shop) {
        ShopPL shopPL = (ShopPL) shop;

        System.out.println("Polish shop data");
        System.out.println("Address: " + shopPL.getAddress() + "\n"
                + "Phone number: " + shopPL.getPhoneNumber() + "\n" +
                "Email: " + shopPL.getEmail() + "\n" +
                "Main currency: " + shopPL.getMainCurrency() + "\n" +
                "City: " + shopPL.getCity() + "\n" +
                "Shop code: " + shopPL.getShopCode() + "\n"
                + "NIP number: " + shopPL.getNipNumber() + "\n");
    }
}