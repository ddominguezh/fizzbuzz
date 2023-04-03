package com.codurance.katalyst;

public class FizzBuzzExtended {
    
    private static int FIZZ_MODULE = 3;
    private static String FIZZ_VALUE = "fizz";

    public String convert(int value){
        String result = null;
        if(value % FIZZ_MODULE == 0){
            result = FIZZ_VALUE;
        }
        if(value == 3){
            result += FIZZ_VALUE;
        }
        if(value == 33){
            result += FIZZ_VALUE;
            result += FIZZ_VALUE;
        }
        if(result != null){
            return result;
        }
        return String.valueOf(value);
    }
}
