package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaDecorator implements PizzaOrder {

    private final PizzaOrder pizza;

    public AbstractPizzaDecorator(PizzaOrder pizza) {
        this.pizza = pizza;
    }

    @Override
    public BigDecimal getCost(){
        return pizza.getCost();
    }

    @Override
    public String getDescription(){
        return pizza.getDescription();
    }

}
