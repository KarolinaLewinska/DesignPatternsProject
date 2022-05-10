package com.java.designpatternsproject.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class RegularCustomerCollection implements Collection {
    private List<Object> customers = new ArrayList<>();

    public Object getCustomer(int index) {
        return customers.get(index);
    }

    public void setCustomer(Object customer) {
        customers.add(customer);
    }

    public int getSize() {
        return customers.size();
    }

    @Override
    public Iterator createIterator() {
        return new RegularCustomerIterator(this);
    }
}