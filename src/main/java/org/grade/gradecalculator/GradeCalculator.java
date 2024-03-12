package org.grade.gradecalculator;

import java.util.List;

public class GradeCalculator {
    private final Courses courses;


    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    // 응집도 고려하여 작성 예제
    public double calculateGrade() {
        // (학점수 * 교과목 평점)의 합계 - 일급 컬렉션
        double totalMultipleliedCreditAndCoursesGrade = courses.muiltiflyCreditAndCourseGrade();

        // 수강신청 총 학점 수 - 일급 컬렉션
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();
        return totalMultipleliedCreditAndCoursesGrade / totalCompletedCredit;
    }
}
