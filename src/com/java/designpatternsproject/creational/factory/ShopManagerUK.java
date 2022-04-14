package com.java.designpatternsproject.creational.factory;

public class ShopManagerUK implements ShopManager {
    @Override
    public void showShopData(Shop shop) {
        ShopUK shopUK = (ShopUK) shop;

        System.out.println("United Kingdom shop data");
        System.out.println("Address: " + shopUK.getAddress() + "\n"
                + "Phone number: " + shopUK.getPhoneNumber() + "\n"
                + "Email: " + shopUK.getEmail() + "\n"
                + "Main currency: " + shopUK.getMainCurrency() + "\n"
                + "City: " + shopUK.getCity() + "\n"
                + "Shop code: " + shopUK.getShopCode() + "\n"
                + "NIP number: " + shopUK.getNinNumber() + "\n");
    }
}