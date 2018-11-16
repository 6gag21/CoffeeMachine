package com.company.aca.model;

public abstract class CoffeeModel {
    private final int coffeeAmount;
    private final int waterAmount;
    private final int milkAmount;
    private final int creamAmount;

    CoffeeModel(int coffeeAmount, int waterAmount, int milkAmount, int creamAmount) {
        this.coffeeAmount = coffeeAmount;
        this.waterAmount = waterAmount;
        this.milkAmount = milkAmount;
        this.creamAmount = creamAmount;
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }

    public int getWaterAmount() { return waterAmount; }

    public int getMilkAmount() {
        return milkAmount;
    }

    public int getCreamAmount() {
        return creamAmount;
    }


}
