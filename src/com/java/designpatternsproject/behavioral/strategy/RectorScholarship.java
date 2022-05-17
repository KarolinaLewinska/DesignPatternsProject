package com.java.designpatternsproject.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class RectorScholarship extends Scholarship {
    private static final double MIN_GRADE_AVERAGE = 4.7;
    public static List<Student> rectorScholarshipStudents = new ArrayList<>();

    @Override
    public void grandScholarship(Student student) {
        if (checkIfStudentCanGrantScholarship(student)) {
            scholarshipAmountMonthly = 850.0;
            rectorScholarshipStudents.add(student);
            System.out.println("Rector scholarship granded to: " + student.getNameAndSurname() + " index: " + student.getIndexNumber());
        } else {
            System.out.println("Rector scholarship not granded to: " + student.getNameAndSurname() + " index: " + student.getIndexNumber());
            System.out.println("The grades average is too low: " + student.getGradesAverage());
        }
    }

    @Override
    boolean checkIfStudentCanGrantScholarship(Student student) {
        return student.getGradesAverage() >= MIN_GRADE_AVERAGE;
    }
}
