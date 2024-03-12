package org.grade.gradecalculator;

import java.util.List;

public class Courses {
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double muiltiflyCreditAndCourseGrade() {
        return courses.stream()
                .mapToDouble(Course::multiflyCreditAndCoursesGrade)
                .sum();
    }

    public int calculateTotalCompletedCredit() {
        int totalCompletedCredit = courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
        return totalCompletedCredit;
    }
}
