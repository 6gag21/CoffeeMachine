package com.company.aca;

import com.company.aca.display.Display;



public class PrepareThread extends Thread {
    public void run(){
        Display.print2("Prepairing");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Display.print2(".");
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Display.print2(".");
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Display.print(".");
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
