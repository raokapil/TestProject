package com.company.designPattern.creational.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Data Structure");
        subjects.add("DAA");
        subjects.add("MicroProcessor");
        this.subjects = subjects;
        return this;
    }
}
