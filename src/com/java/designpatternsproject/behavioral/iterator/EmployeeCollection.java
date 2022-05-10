package com.java.designpatternsproject.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCollection implements Collection {
    private List<Object> employees = new ArrayList<>();

    public Object getEmployee(int index) {
        return employees.get(index);
    }

    public void setEmployee(Object employee) {
        employees.add(employee);
    }

    public int getSize() {
        return employees.size();
    }

    @Override
    public Iterator createIterator() {
        return new EmployeeIterator(this);
    }
}