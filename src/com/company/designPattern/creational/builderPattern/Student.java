package com.company.designPattern.creational.builderPattern;

import java.util.List;

public class Student {

    private int rollNo;
    private String studentName;
    private String fatherName;
    private List<String> subjects;

    public Student(StudentBuilder builder) {
        this.rollNo = builder.rollNo;
        this.studentName = builder.studentName;
        this.fatherName = builder.fatherName;
        this.subjects = builder.subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", studentName='" + studentName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", subjects=" + subjects.get(0) +
                '}';
    }
}
