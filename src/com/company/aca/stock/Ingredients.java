package com.company.aca.stock;

import java.util.HashMap;

public class Ingredients {
   public  static final String INGREDIENT_COFFEE = "Coffee";
   public  static final String INGREDIENT_MILK = "Milk";
   public  static final String INGREDIENT_WATER = "Water";
   public  static final String INGREDIENT_SUGAR = "Sugar";
   public  static final String INGREDIENT_CREAM = "Cream";

   private static   Ingredients instance;
   private Ingredients(){}

   public static Ingredients getInstance(){
      if(instance == null){
         instance = new Ingredients();
      }
      return instance;
   }

   HashMap<String,Integer> ingredients = new HashMap<>(){{
      put(INGREDIENT_COFFEE,1000);
      put(INGREDIENT_MILK,2000);
      put(INGREDIENT_CREAM,1000);
      put(INGREDIENT_WATER,5000);
      put(INGREDIENT_SUGAR,1000);
   }};

   public HashMap<String, Integer> getIngredient() {
      return ingredients;
   }
}
