package com.codurance.katalyst;

public class FizzBuzzExtended {
    
    private static int FIZZ_MODULE = 3;
    private static String FIZZ_VALUE = "fizz";
    private static int BUZZ_MODULE = 5;
    private static String BUZZ_VALUE = "buzz";

    public String convert(int value){
        String result = null;
        if(value % FIZZ_MODULE == 0){
            result = FIZZ_VALUE;
        }
        if(value % BUZZ_MODULE == 0){
            result = BUZZ_VALUE;
        }
        for(char number : String.valueOf(value).toCharArray()) {
            if(Character.getNumericValue(number) == FIZZ_MODULE){
                result += FIZZ_VALUE;
            }else if(Character.getNumericValue(number) == BUZZ_MODULE){
                result += BUZZ_VALUE;
            }
        }
        if(result != null){
            return result;
        }
        return String.valueOf(value);
    }
}
