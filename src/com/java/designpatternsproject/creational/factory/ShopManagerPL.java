package com.java.designpatternsproject.creational.factory;

public class ShopManagerPL implements ShopManager {
    public void showShopData(Shop shop) {
        ShopPL shopPL = (ShopPL) shop;
        System.out.println("Polish shop data");
        System.out.println("Shop code: " + shopPL.getShopCode() + "\n"
                + "Address: " + shopPL.getAddress() + "\n"
                + "City: " + shopPL.getCity() + "\n"
                + "Main currency: " + shopPL.getMainCurrency() + "\n"
                + "Tax id: " + shopPL.getNipNumber() + "\n"
                + "Phone number: " + shopPL.getPhoneNumber() + "\n"
                + "Email: " + shopPL.getEmail() + "\n");
    }
}