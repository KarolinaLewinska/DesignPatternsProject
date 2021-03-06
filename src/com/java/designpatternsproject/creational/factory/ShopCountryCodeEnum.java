package com.java.designpatternsproject.creational.factory;

public enum ShopCountryCodeEnum {
    GERMANY("DE"), UNITED_KINGDOM("UK");

    public final String COUNTRY_CODE;

    ShopCountryCodeEnum(String countryCode) {
        this.COUNTRY_CODE = countryCode;
    }
}