package com.company.designPattern.creational.builderPattern;

import java.util.List;

public abstract class StudentBuilder {

     int rollNo;
     String studentName;
     String fatherName;
     List<String> subjects;

     public StudentBuilder setRollNo(int rollNo) {
         this.rollNo = rollNo;
         return this;
     }

     public StudentBuilder setStudentName(String name) {
         this.studentName = studentName;
         return this;
     }

     public StudentBuilder setFatherName(String fatherName) {
         this.fatherName = fatherName;
         return this;
     }

     public abstract StudentBuilder setSubjects();

     public Student build() {
         return new Student(this);
     }
}
