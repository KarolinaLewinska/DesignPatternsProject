package com.java.designpatternsproject.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class SocialScholarship extends Scholarship {
    private static final double MAX_INCOME_NETTO_MONTHLY = 1050.00;
    public static List<Student> socialScholarshipStudents = new ArrayList<>();

    @Override
    public void grandScholarship(Student student) {
        if (checkIfStudentCanGrantScholarship(student)) {
            if (student.getIncomeNettoMonthly() <= 310.00) {
                socialScholarshipStudents.add(student);
                scholarshipAmountMonthly = 1120.00;
                System.out.println("Social scholarship granded to: " + student.getNameAndSurname() + " index: " + student.getIndexNumber());
                System.out.println("Amount of scholarship per month: " + scholarshipAmountMonthly);
            } else if (student.getIncomeNettoMonthly() > 310.00 && student.getIncomeNettoMonthly() <= 620.00) {
                socialScholarshipStudents.add(student);
                scholarshipAmountMonthly = 1040.00;
                System.out.println("Amount of scholarship per month: " + scholarshipAmountMonthly);
            } else {
                socialScholarshipStudents.add(student);
                scholarshipAmountMonthly = 970.00;
                System.out.println("Amount of scholarship per month: " + scholarshipAmountMonthly);
            }
        } else {
            System.out.println("Social scholarship not granded to: " + student.getNameAndSurname() + " index: " + student.getIndexNumber());
        }
    }

    @Override
    boolean checkIfStudentCanGrantScholarship(Student student) {
        return student.getIncomeNettoMonthly() <= MAX_INCOME_NETTO_MONTHLY;
    }
}