package com.java.designpatternsproject.behavioral.mediator;

import java.math.BigDecimal;
import java.util.List;

public class Receipt {
    public List<String> products;
    public BigDecimal totalCost;
    public BigDecimal loyalPoints;
    public int extraDiscountPercent;

    public Receipt(List<String> products, BigDecimal totalCost) {
        this.products = products;
        this.totalCost = totalCost;
    }
}