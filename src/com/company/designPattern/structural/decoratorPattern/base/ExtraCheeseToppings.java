package com.company.designPattern.structural.decoratorPattern.base;


public class ExtraCheeseToppings extends Toppings {

    // HAS-A relationship
    private BasePizza pizza;

    public ExtraCheeseToppings(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 10;
    }
}
