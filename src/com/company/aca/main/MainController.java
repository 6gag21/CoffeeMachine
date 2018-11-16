package com.company.aca.main;


import com.company.aca.coinreader.CoinReader;
import com.company.aca.display.Display;
import com.company.aca.numberPanel.Panel;
import com.company.aca.product.MakeableProduct;


import java.util.Scanner;


public class MainController {

    private int insertedAmount = 0;
    private CoinReader cr = new CoinReader();
    private Scanner sc = new Scanner(System.in);
    private int balance = 0;
    private Display display = new Display();

    public void start() {
        MakeableProduct product = new MakeableProduct();
        MainController mainController = new MainController();

        display.print("Please insert coin\n");
        insertedAmount += cr.readCoin(sc.nextInt());

        if (insertedAmount == 0) {
            mainController.start();
        }

        display.print("Amount: " + Integer.toString(insertedAmount) + "\n");
        display.print("Choose product\n");
        String st = sc.next();

        if (!panelEquals(st)) {
            mainController.start();
        }

        if (insertedAmount >= product.getPrice(Panel.valueOf(st))) {
            try {
                product.prepare(Panel.valueOf(st));
            } catch (NullPointerException e) {
                display.print("Preparing failed!\n" + "Not enough ingredients\n" + "Choose another product\n");
                System.out.println(Panel.valueOf(st));
                mainController.start();
            }
            display.print("Maked\n" + "Take your " + product.getName(Panel.valueOf(st)) + "\n");
            if (insertedAmount > product.getPrice(Panel.valueOf(st))) {
                int change = insertedAmount - product.getPrice(Panel.valueOf(st));
                display.print("Your change: " + change + "\n");
                insertedAmount -= change;
            }
            balance += insertedAmount;
            insertedAmount = 0;
            mainController.start();

        } else {
            display.print("Not enough amount\n");
            mainController.start();
        }
    }

    private boolean panelEquals(String st) {
        for (Panel panel : Panel.values()) {
            if (st.equals(panel.name())) {
                return true;
            }
        }
        return false;
    }
}






