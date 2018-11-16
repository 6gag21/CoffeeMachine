package com.company.aca.maker;

import com.company.aca.model.CoffeeModel;
import com.company.aca.stock.Ingredients;
import com.company.aca.stock.StockManager;

public class CoffeeMaker {
    private StockManager stManager = new StockManager();

    public void make(CoffeeModel coffee) {

        if (stManager.isAvailable(Ingredients.INGREDIENT_COFFEE, coffee.getCoffeeAmount()) &&
                stManager.isAvailable(Ingredients.INGREDIENT_WATER, coffee.getWaterAmount()) &&
                stManager.isAvailable(Ingredients.INGREDIENT_MILK, coffee.getMilkAmount()) &&
                stManager.isAvailable(Ingredients.INGREDIENT_CREAM, coffee.getCreamAmount())) {

            stManager.giveIngredient(Ingredients.INGREDIENT_COFFEE, coffee.getCoffeeAmount());
            stManager.giveIngredient(Ingredients.INGREDIENT_WATER, coffee.getWaterAmount());
            stManager.giveIngredient(Ingredients.INGREDIENT_MILK, coffee.getMilkAmount());
            stManager.giveIngredient(Ingredients.INGREDIENT_CREAM, coffee.getCreamAmount());

        } else {
            throw new NullPointerException();
        }
    }

}
