package com.codurance.katalyst;

public class FizzBuzz {
    
    private static int FIZZ_MODULE = 3;
    private static String FIZZ_VALUE = "fizz";
    private static String BUZZ_VALUE = "buzz";

    public String convert(int value){
        if(value % FIZZ_MODULE == 0){
            return FIZZ_VALUE;
        }
        if(value == 5){
            return BUZZ_VALUE;
        }
        return "" + value;
    }
}
