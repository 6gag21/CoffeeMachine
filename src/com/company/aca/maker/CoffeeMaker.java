package com.company.aca.maker;

import com.company.aca.model.CoffeeModel;
import com.company.aca.stock.Ingredients;
import com.company.aca.stock.StockManager;

public class CoffeeMaker {
    public static void make(CoffeeModel coffee){
        StockManager.giveIngredient(Ingredients.INGREDIENT_COFFEE,coffee.getCoffeeAmount());
        StockManager.giveIngredient(Ingredients.INGREDIENT_WATER,coffee.getWaterAmount());
        StockManager.giveIngredient(Ingredients.INGREDIENT_MILK,coffee.getMilkAmount());
        StockManager.giveIngredient(Ingredients.INGREDIENT_CREAM,coffee.getCreamAmount());
    }
}
