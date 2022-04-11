package com.java.designpatternsproject.creational.factory;

public class ShopManagerFactory {
    public Shop getShop(String countryCode) {
        if (ShopCountryCodeEnum.GERMANY.COUNTRY_CODE.equals(countryCode)) {
            return new ShopDE();
        } else if (ShopCountryCodeEnum.UNITED_KINGDOM.COUNTRY_CODE.equals(countryCode)) {
            return new ShopUK();
        } else if (ShopCountryCodeEnum.POLAND.COUNTRY_CODE.equals(countryCode)) {
            return  new ShopPL();
        }
        return null;
    }
}