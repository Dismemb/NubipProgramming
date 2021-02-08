package com.nubip.programming.lab2.university;

import com.nubip.programming.lab2.university.members.Student;
import com.nubip.programming.lab2.university.system.GradeChecker;
import com.nubip.programming.lab2.university.system.GradeCheckerImpl;

public class Test {

    public static void main(String[] args) {
        Student student = new Student(52);
        GradeChecker gradeChecker = new GradeCheckerImpl();

        System.out.println(gradeChecker.getGradeRank(student.getGrade()));
    }
}
