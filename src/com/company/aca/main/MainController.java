package com.company.aca.main;

import com.company.aca.Main;
import com.company.aca.PrepareThread;
import com.company.aca.coinreader.CoinReader;
import com.company.aca.display.Display;
import com.company.aca.numberPanel.Panel;
import com.company.aca.product.MakeableProduct;
import com.company.aca.product.Product;
import com.company.aca.stock.Ingredients;
import com.company.aca.stock.StockManager;


import java.util.Scanner;


public class MainController {
    private static int insertedAmount = 0;
    private static CoinReader cr = new CoinReader();
    private static Scanner sc = new Scanner(System.in);
    private static  int balance;

    public static void start() {

        Display.print("Please insert coin");
        insertedAmount += cr.readCoin(sc.nextInt());
        Display.print("Amount: " +Integer.toString(insertedAmount));
        Display.print("Choose product");
        String st = sc.next();
        if(!panelEquals(st)){
            MainController.start();
         }
        Product product = new MakeableProduct();
        if (insertedAmount>= ((MakeableProduct) product).getPrice(Panel.valueOf(st))) {
            product.prepare(Panel.valueOf(st));
            Display.print("Maked");
            if(insertedAmount>((MakeableProduct) product).getPrice(Panel.valueOf(st))){
                int change = insertedAmount - ((MakeableProduct) product).getPrice(Panel.valueOf(st));
                System.out.println("Your change " + change );
                insertedAmount-=change;
            }
            balance+=insertedAmount;
            insertedAmount = 0;

            MainController.start();
        } else {
            Display.print("Not enough amount");
            MainController.start();

        }

    }

    private static boolean panelEquals(String st) {
        for (Panel panel : Panel.values()) {
            if (st.equals(panel.name())) {
                return true;
            }
        }
        return false;
    }




    }




