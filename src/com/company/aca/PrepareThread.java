package com.company.aca;

import com.company.aca.display.Display;


public class PrepareThread extends Thread {
    private Display display = new Display();

    public void run() {
        display.print("Prepairing");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        display.print(".");
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        display.print(".");
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        display.print(".\n");
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
