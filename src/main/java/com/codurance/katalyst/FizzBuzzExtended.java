package com.codurance.katalyst;

public class FizzBuzzExtended {
    
    private static int FIZZ_MODULE = 3;
    private static String FIZZ_VALUE = "fizz";
    private static String BUZZ_VALUE = "buzz";

    public String convert(int value){
        String result = null;
        if(value % FIZZ_MODULE == 0){
            result = FIZZ_VALUE;
        }
        if(value == 5){
            result = BUZZ_VALUE+BUZZ_VALUE;
        }
        if(value == 55){
            result = BUZZ_VALUE+BUZZ_VALUE+BUZZ_VALUE;
        }
        for(char number : String.valueOf(value).toCharArray()) {
            if(Character.getNumericValue(number) == FIZZ_MODULE){
                result += FIZZ_VALUE;
            }
        }
        if(result != null){
            return result;
        }
        return String.valueOf(value);
    }
}
