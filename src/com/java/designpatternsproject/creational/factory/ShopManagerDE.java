package com.java.designpatternsproject.creational.factory;

public class ShopManagerDE implements ShopManager {
    public void showShopData(Shop shop) {
        ShopDE shopDE = (ShopDE) shop;
        System.out.println("German shop data");
        System.out.println("Shop code: " + shopDE.getShopCode() + "\n"
                + "Address: " + shopDE.getAddress() + "\n"
                + "City: " + shopDE.getCity() + "\n"
                + "Main currency: " + shopDE.getMainCurrency() + "\n"
                + "Tax id: " + shopDE.getIdNumber() + "\n"
                + "Phone number: " + shopDE.getPhoneNumber() + "\n"
                + "Email: " + shopDE.getEmail() + "\n");
    }
}