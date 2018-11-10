package com.company.aca.product;


import com.company.aca.model.CoffeeModel;
import com.company.aca.numberPanel.Panel;

public  abstract class Product {
    long id;
    int price;
    String name;
   static Panel m;
   static CoffeeModel c;

    Product(long id, int price, String name, Panel m,CoffeeModel c){
        this.id=id;
        this.price=price;
        this.name=name;
        this.m = m;
        this.c = c;
    }
    Product(){};
   public  abstract void prepare(Panel m);

}
