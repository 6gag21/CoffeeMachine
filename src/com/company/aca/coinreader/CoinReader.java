package com.company.aca.coinreader;


import com.company.aca.display.Display;

import java.util.HashSet;
import java.util.Set;

public class CoinReader {
    private static final int COIN_FIFTY = 50;
    private static final int COIN_HUNDRED =100 ;
    private static final int COIN_TWO_HUNDRED = 200;
    private static final int COIN_FIVE_HUNDRED = 500;

    private Set<Integer> coins = new HashSet<>(){{
        add(COIN_FIFTY);
        add(COIN_HUNDRED);
        add(COIN_TWO_HUNDRED);
        add(COIN_FIVE_HUNDRED);
    }};


    public  int readCoin(int amount){
        Display display = new Display();
        for(Integer i: coins){
            if (amount==i){
            return amount;
            }


            }
        display.print("Invalid coin\n");
        return 0;
        }


    }


