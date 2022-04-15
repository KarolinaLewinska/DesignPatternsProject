package com.java.designpatternsproject.creational.factory;

public class ShopManagerUK implements ShopManager {
    public void showShopData(Shop shop) {
        ShopUK shopUK = (ShopUK) shop;
        System.out.println("United Kingdom shop data");
        System.out.println("Shop code: " + shopUK.getShopCode() + "\n"
                + "Address: " + shopUK.getAddress() + "\n"
                + "City: " + shopUK.getCity() + "\n"
                + "Main currency: " + shopUK.getMainCurrency() + "\n"
                + "Tax id: " + shopUK.getNinNumber() + "\n"
                + "Phone number: " + shopUK.getPhoneNumber() + "\n"
                + "Email: " + shopUK.getEmail() + "\n");
    }
}