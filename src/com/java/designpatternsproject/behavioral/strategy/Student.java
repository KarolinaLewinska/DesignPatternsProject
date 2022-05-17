package com.java.designpatternsproject.behavioral.strategy;

public class Student {
    private String indexNumber;
    private String nameAndSurname;
    private double gradesAverage;
    private double incomeNettoMonthly;

    public Student(String indexNumber, String nameAndSurname, double gradesAverage, double incomeNettoMonthly) {
        this.indexNumber = indexNumber;
        this.nameAndSurname = nameAndSurname;
        this.gradesAverage = gradesAverage;
        this.incomeNettoMonthly = incomeNettoMonthly;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public double getGradesAverage() {
        return gradesAverage;
    }

    public double getIncomeNettoMonthly() {
        return incomeNettoMonthly;
    }
}