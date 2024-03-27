package com.company.designPattern.creational.builderPattern;

public class Director {

    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if (studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        } else {
            return createMBAStudent();
        }
    }

    private Student createMBAStudent() {

        return studentBuilder.setRollNo(2).setStudentName("ABC").setSubjects().build();
    }

    private Student createEngineeringStudent() {

        return studentBuilder.setRollNo(1).setStudentName("Kapil").setSubjects().build();
    }
}
