package com.company.designPattern.structural.compositePattern.calculator;

public class Expression implements AirthmeticExpression{

    private AirthmeticExpression leftAirthmeticExpression;
    private AirthmeticExpression rightAirthmeticExpression;
    private Operation operation;

    Expression(AirthmeticExpression leftAirthmeticExpression, AirthmeticExpression rightAirthmeticExpression,
               Operation operation) {
        this.leftAirthmeticExpression = leftAirthmeticExpression;
        this.rightAirthmeticExpression = rightAirthmeticExpression;
        this.operation = operation;
    }

    @Override
    public int evaluate() {

        int value = 0;

        switch (operation) {
            case ADD:
                value = leftAirthmeticExpression.evaluate() + rightAirthmeticExpression.evaluate();
                break;
            case DIVIDE:
                value = leftAirthmeticExpression.evaluate() / rightAirthmeticExpression.evaluate();
                break;
            case SUBTRACT:
                value = leftAirthmeticExpression.evaluate() - rightAirthmeticExpression.evaluate();
                break;
            case MULTIPLY:
                value = leftAirthmeticExpression.evaluate() * rightAirthmeticExpression.evaluate();
                break;
            }
            return value;
        }


    }
