package org.grade.gradecalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 요구사항
 * 평균학점 계산방법 = (학점수 * 교과목 평점)의 합계 / 수강신청 총 학점 수
 * 일급 컬렉션 사용
 */
public class GradeCalculatorTest {
    // 도메인 : 이수한 과목(객체지향프로그래밍, 자바, 스프링, 자료구조 등), 학점 계산기
    // 이수한 과목을 전달하여 평군학점 계산 요청 --> 학점 계산기 ---> (학점수 * 교과목 평점)의 합계 --> 과목
    //                                              ---> 수강신청 총학점수          ---> 과목

    @DisplayName("평균 학점을 계산한다.")
    @Test
    void calculateGradeTest() {
        List<Course> courses = List.of(new Course("OOP", 3, "A+"),
                new Course("자료구조", 3, "A+"));

        // 학점 계산기를 통해 값을 넣어준 뒤 값을 반환 받을 예정
        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double gradeResult = gradeCalculator.calculateGrade();
        assertThat(gradeResult).isEqualTo(4.5);
    }
}
