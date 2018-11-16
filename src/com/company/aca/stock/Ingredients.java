package com.company.aca.stock;

import java.util.HashMap;

public class Ingredients {
    public static final String INGREDIENT_COFFEE = "Coffee";
    public static final String INGREDIENT_MILK = "Milk";
    public static final String INGREDIENT_WATER = "Water";
    public static final String INGREDIENT_SUGAR = "Sugar";
    public static final String INGREDIENT_CREAM = "Cream";
    private static final int AMOUNT_OF_COFFEE = 1000;
    private static final int AMOUNT_OF_MILK = 2000;
    private static final int AMOUNT_OF_CREAM = 1000;
    private static final int AMOUNT_OF_WATER = 5000;
    private static final int AMOUNT_OF_SUGAR = 1000;

    private static Ingredients instance;

    private Ingredients() {
    }

    static Ingredients getInstance() {
        if (instance == null) {
            instance = new Ingredients();
        }
        return instance;
    }

    private HashMap<String, Integer> ingredients = new HashMap<>() {{
        put(INGREDIENT_COFFEE, AMOUNT_OF_COFFEE);
        put(INGREDIENT_MILK, AMOUNT_OF_MILK);
        put(INGREDIENT_CREAM, AMOUNT_OF_CREAM);
        put(INGREDIENT_WATER, AMOUNT_OF_WATER);
        put(INGREDIENT_SUGAR, AMOUNT_OF_SUGAR);
    }};

    HashMap<String, Integer> getIngredient() {
        return ingredients;
    }
}
