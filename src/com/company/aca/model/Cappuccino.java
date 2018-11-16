package com.company.aca.model;

public class Cappuccino extends CoffeeModel {
    private static final int coffee = 5;
    private static final int water = 100;
    private static final int milk = 50;
    private static final int cream = 10;

    public Cappuccino() {
        super(coffee, water, milk, cream);
    }
}
