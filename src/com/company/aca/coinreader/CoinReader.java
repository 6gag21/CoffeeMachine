package com.company.aca.coinreader;

import com.company.aca.display.Display;

import java.util.HashSet;
import java.util.Set;

public class CoinReader {
    public static final int COIN_FIFTY = 50;
    public static final int COIN_HUNDRED =100 ;
    public static final int COIN_TWO_HUNDRED = 200;
    public static final int COIN_FIVE_HUNDRED = 500;

    Set<Integer> coins = new HashSet<Integer>(){{
        add(COIN_FIFTY);
        add(COIN_HUNDRED);
        add(COIN_TWO_HUNDRED);
        add(COIN_FIVE_HUNDRED);
    }};


    public   int readCoin(int amount){
        for(Integer i: coins){
            if (amount==i){
            return amount;
            }


            }
        Display.print("Invalid coin");
        return 0;
        }


    }


