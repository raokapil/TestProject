package com.company.designPattern.structural.decoratorPattern.base;

public class MushroomToppings extends Toppings{

    private BasePizza pizza;

    public MushroomToppings(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 20;
    }
}
