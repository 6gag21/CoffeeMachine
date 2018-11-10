package com.company.aca.product;


import com.company.aca.maker.CoffeeMaker;
import com.company.aca.model.Cappuccino;
import com.company.aca.model.CoffeeModel;
import com.company.aca.model.Espresso;
import com.company.aca.model.Latte;
import com.company.aca.numberPanel.Panel;
import com.sun.jdi.Value;


import java.util.*;

import static javax.swing.UIManager.put;

public class MakeableProduct extends Product {
    static CoffeeModel espr = new Espresso();
   static CoffeeModel cap = new Cappuccino();
   static CoffeeModel lat = new Latte();

    public MakeableProduct(long id, int price, String name, Panel m, CoffeeModel c) {
        super(id, price, name, m, c);
    }
    public MakeableProduct(){};

    static Product espresso = new MakeableProduct(1, 100, "Espresso", Panel.A1, espr);
    static Product cappuccino = new MakeableProduct(2, 200, "Cappuccino", Panel.A2, cap);
    static Product latte = new MakeableProduct(3, 250, "Latte", Panel.A3, lat);

    public int getPrice(Panel m){
        switch (m){
            case A1: return espresso.price;

            case A2: return cappuccino.price;

            case A3: return latte.price;

        }
        return 0;
    }



    public  void prepare(Panel m) {
    switch (m){
        case A1: CoffeeMaker.make(espr);
                break;
        case A2: CoffeeMaker.make(cap);
        break;
        case A3: CoffeeMaker.make(lat);
        break;
    }
    }

}



