package com.java.designpatternsproject.patternsrunners;

import com.java.designpatternsproject.creational.factory.Shop;
import com.java.designpatternsproject.creational.factory.ShopDE;
import com.java.designpatternsproject.creational.factory.ShopManagerDE;
import com.java.designpatternsproject.creational.factory.ShopManagerFactory;
import com.java.designpatternsproject.creational.factory.ShopManagerPL;
import com.java.designpatternsproject.creational.factory.ShopPL;
import com.java.designpatternsproject.creational.singleton.ConfigFileSingleton;

import java.io.IOException;

public class CreationalPatternsRunners {

    public static void runSingleton() {
        try {
            ConfigFileSingleton configFileInstance = ConfigFileSingleton.getInstance();
            ConfigFileSingleton configFileInstance2 = ConfigFileSingleton.getInstance();
            if (configFileInstance.getConfigFilePath() == configFileInstance2.getConfigFilePath()) {
                System.out.println("Only one instance of db config file");
            }
        } catch (IOException exc) {
            throw new RuntimeException("Exception occurred during creating singleton instance");
        }
    }

    public static void runFactory() {
        ShopManagerFactory factory = new ShopManagerFactory();
        ShopManagerDE shopManagerDE = new ShopManagerDE();
        Shop shopDE = factory.getShop("DE");
        shopDE.setShopCode(12345);
        shopDE.setAddress("Hauptstrasse 4a");
        shopDE.setCity("Hamburg");
        shopDE.setPhoneNumber("+49 171 1234567");
        shopDE.setEmail("shop-max-de@gmail.com");
        shopDE.setMainCurrency("EUR");
        ShopDE shopDECasted = (ShopDE) shopDE;
        shopDECasted.setIdNumber("12345678909");
        shopManagerDE.showShopData(shopDE);

        ShopManagerPL shopManagerPL = new ShopManagerPL();
        Shop shopPL = factory.getShop("PL");
        shopPL.setShopCode(95465);
        shopPL.setAddress("Warszawska 11F/21");
        shopPL.setCity("Warszawa");
        shopPL.setPhoneNumber("+48 123 456 789");
        shopPL.setEmail("shop-max-pl@gmail.com");
        shopPL.setMainCurrency("PLN");
        ShopPL shopPLCasted = (ShopPL) shopPL;
        shopPLCasted.setNipNumber("09845943212");
        shopManagerPL.showShopData(shopPL);
    }
}