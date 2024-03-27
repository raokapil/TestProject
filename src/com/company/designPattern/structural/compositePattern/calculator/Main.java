package com.company.designPattern.structural.compositePattern.calculator;

public class Main {

    public static void main (String[] args) {

        // 2 * (1 + 7)

        AirthmeticExpression two = new Number(2);
        AirthmeticExpression one = new Number(1);
        AirthmeticExpression seven = new Number(7);

        AirthmeticExpression expression = new Expression(one, seven, Operation.ADD);
        AirthmeticExpression finalExpression = new Expression(two, expression, Operation.MULTIPLY);

        System.out.println("Result is " + finalExpression.evaluate());

    }
}
