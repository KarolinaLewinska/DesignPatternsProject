package com.java.designpatternsproject.patternsrunners;

import com.java.designpatternsproject.creational.factory.Shop;
import com.java.designpatternsproject.creational.factory.ShopDE;
import com.java.designpatternsproject.creational.factory.ShopManagerDE;
import com.java.designpatternsproject.creational.factory.ShopManagerFactory;
import com.java.designpatternsproject.creational.factory.ShopManagerPL;
import com.java.designpatternsproject.creational.factory.ShopManagerUK;
import com.java.designpatternsproject.creational.factory.ShopPL;
import com.java.designpatternsproject.creational.factory.ShopUK;
import com.java.designpatternsproject.creational.prototype.ImageJPG;
import com.java.designpatternsproject.creational.prototype.ImagePNG;
import com.java.designpatternsproject.creational.singleton.ConfigFileSingleton;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CreationalPatternsRunners {
    public static void runSingleton() {
        try {
            ConfigFileSingleton configFileInstance = ConfigFileSingleton.getInstance();
            ConfigFileSingleton configFileInstance2 = ConfigFileSingleton.getInstance();
            if (configFileInstance.getConfigFilePath() == configFileInstance2.getConfigFilePath()) {
                System.out.println("Only one instance of db config file \n");
            }
        } catch (IOException exc) {
            exc.printStackTrace();
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

        ShopManagerUK shopManagerUK = new ShopManagerUK();
        Shop shopUK = factory.getShop("UK");
        shopUK.setShopCode(58594);
        shopUK.setAddress("Howard Street Oswego");
        shopUK.setCity("London");
        shopUK.setPhoneNumber("+44 7911 123456");
        shopUK.setEmail("shop-max-uk@gmail.com");
        shopUK.setMainCurrency("GBP");
        ShopUK shopUKCasted = (ShopUK) shopUK;
        shopUKCasted.setNinNumber("54845059212");
        shopManagerUK.showShopData(shopUK);
    }

    public static void runPrototype() {
        try {
            BufferedImage bufferedPNG = ImageIO.read(new File("src/com/java/designpatternsproject/creational/prototype/explosion.png"));
            BufferedImage bufferedJPG = ImageIO.read(new File("src/com/java/designpatternsproject/creational/prototype/owl.jpeg"));
            ImagePNG imagePNG = new ImagePNG("explosion", ".png", bufferedPNG);
            ImagePNG clonePNG = (ImagePNG) imagePNG.clone();
            ImageJPG imageJPG = new ImageJPG("owl", ".jpeg", bufferedJPG);
            ImageJPG cloneJPG = (ImageJPG) imageJPG.clone();

            if (imagePNG.imgName.equals(clonePNG.imgName) && imageJPG.picture == cloneJPG.picture) {
                System.out.println(clonePNG.imgName + " is the copy of " + imagePNG.imgName);
                System.out.println(cloneJPG.imgName + " is the copy of " + imageJPG.imgName + "\n");
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}