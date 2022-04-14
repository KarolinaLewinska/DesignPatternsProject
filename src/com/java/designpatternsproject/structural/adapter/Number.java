package com.java.designpatternsproject.structural.adapter;

public class Number {
    public long valueToConvert;

    public Number(long valueToConvert) {
        this.valueToConvert = valueToConvert;
    }

    public long getValueToConvert() {
        return valueToConvert;
    }
}