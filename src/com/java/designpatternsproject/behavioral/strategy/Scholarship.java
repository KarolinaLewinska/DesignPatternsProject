package com.java.designpatternsproject.behavioral.strategy;


public abstract class Scholarship {
    double scholarshipAmountMonthly;

    public abstract void grandScholarship(Student student);
    abstract boolean checkIfStudentCanGrantScholarship(Student student);
}