package com.java.designpatternsproject.behavioral.iterator;

public class EmployeeIterator implements Iterator {
    private EmployeeCollection employeeCollection;
    private int elementIndex = 0;

    public EmployeeIterator(EmployeeCollection employeeCollection) {
        this.employeeCollection = employeeCollection;
    }

    @Override
    public Object getNext() {
        if (this.hasNext()) {
            return employeeCollection.getEmployee(elementIndex++);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return elementIndex < employeeCollection.getSize();
    }
}