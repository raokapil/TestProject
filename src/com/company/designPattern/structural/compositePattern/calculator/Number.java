package com.company.designPattern.structural.compositePattern.calculator;

public class Number implements AirthmeticExpression{

    private int number;

    Number(int number) {
        this.number = number;
    }

    @Override
    public int evaluate() {
        System.out.println("Number is " + number);
        return number;
    }
}
