package com.company.aca.product;


import com.company.aca.PrepareThread;
import com.company.aca.maker.CoffeeMaker;
import com.company.aca.model.Cappuccino;
import com.company.aca.model.CoffeeModel;
import com.company.aca.model.Espresso;
import com.company.aca.model.Latte;
import com.company.aca.numberPanel.Panel;


public class MakeableProduct extends Product {
    private static CoffeeModel espr = new Espresso();
   private static CoffeeModel cap = new Cappuccino();
   private static CoffeeModel lat = new Latte();



    private MakeableProduct(long id, int price, String name, Panel m, CoffeeModel c) {
        super(id, price, name, m, c);
    }
    public MakeableProduct(){};

    private static Product espresso = new MakeableProduct(1, 100, "Espresso", Panel.A1, espr);
    private static Product cappuccino = new MakeableProduct(2, 200, "Cappuccino", Panel.A2, cap);
    private static Product latte = new MakeableProduct(3, 250, "Latte", Panel.A3, lat);

    public int getPrice(Panel m){
        switch (m){
            case A1: return espresso.price;

            case A2: return cappuccino.price;

            case A3: return latte.price;

        }
        return 0;
    }


    public void prepare (Panel m){
        PrepareThread thread1 = new PrepareThread();
        thread1.run();

        switch (m) {
            case A1:
                CoffeeMaker.make(espr);
                break;
            case A2:
                CoffeeMaker.make(cap);
                break;
            case A3:
                CoffeeMaker.make(lat);
                break;
        }

    }

}





