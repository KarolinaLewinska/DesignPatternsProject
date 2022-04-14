package com.java.designpatternsproject.structural.adapter;

import java.nio.charset.StandardCharsets;

public class NumbersAdapter extends BinaryValue {
    private Number numberToConvert;

    public NumbersAdapter(Number numberToConvert) {
        this.numberToConvert = numberToConvert;
    }

    @Override
    public String getValueInBinaryString() {
        return Long.toBinaryString(numberToConvert.getValueToConvert());
    }

    @Override
    public int getBytesLength() {
        return getValueInBinaryString().getBytes(StandardCharsets.UTF_8).length;
    }

    @Override
    public void printInfo() {
        System.out.println("Representation of number: " + numberToConvert.valueToConvert + " equals: " + getValueInBinaryString());
        System.out.println("Length of bytes is: " + getBytesLength() + "\n");
    }
}