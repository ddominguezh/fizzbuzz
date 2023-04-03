package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzExtendedTest {
    
    @ParameterizedTest
    @CsvSource({ "1,1", "2,2", "4,4" })
    public void convert_number_to_number(int input, String expected){
        assertEquals(expected, new FizzBuzzExtended().convert(input));
    }

}
