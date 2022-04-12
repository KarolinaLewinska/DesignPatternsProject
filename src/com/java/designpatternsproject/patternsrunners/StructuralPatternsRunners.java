package com.java.designpatternsproject.patternsrunners;

import com.java.designpatternsproject.structural.adapter.NumbersAdapter;
import com.java.designpatternsproject.structural.adapter.Number;
import com.java.designpatternsproject.structural.adapter.BinaryValue;

public class StructuralPatternsRunners {

    public static void runAdapter() {
        BinaryValue binaryValue = new NumbersAdapter(new Number(1010463435));
        binaryValue.printInfo();
    }
}