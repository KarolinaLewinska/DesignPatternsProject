package com.java.designpatternsproject.behavioral.iterator;

public class RegularCustomerIterator implements Iterator {
    private RegularCustomerCollection customerCollection;
    private int elementIndex;

    public RegularCustomerIterator(RegularCustomerCollection customerCollection) {
        this.customerCollection = customerCollection;
    }

    @Override
    public Object getNext() {
        if (this.hasNext()) {
            return customerCollection.getCustomer(elementIndex++);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return elementIndex < customerCollection.getSize();
    }
}