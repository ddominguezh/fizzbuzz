package com.codurance.katalyst;

public class FizzBuzzExtended {
    
    private static int FIZZ_MODULE = 3;
    private static String FIZZ_VALUE = "fizz";

    public String convert(int value){
        if(value % FIZZ_MODULE == 0){
            return FIZZ_VALUE;
        }
        return String.valueOf(value);
    }
}
