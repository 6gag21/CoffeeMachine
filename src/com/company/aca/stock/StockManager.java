package com.company.aca.stock;

import java.util.HashMap;

public class StockManager {
    public boolean isAvailable(String key, int quantity) {
        HashMap<String, Integer> allProd = Ingredients.getInstance().getIngredient();
        return allProd.get(key) >= quantity;
    }

    public void giveIngredient(String key, int value) throws NullPointerException {
        HashMap<String, Integer> allProd = Ingredients.getInstance().getIngredient();
        int quantity = allProd.get(key);
        int diff = quantity - value;
        allProd.put(key, diff);
    }

}
