package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTest {
    
    @ParameterizedTest
    @CsvSource({ "1,1", "2,2", "4,4" })
    public void convert_number_to_number(int input, String expected){
        assertEquals(expected, new FizzBuzz().convert(input));
    }

    @ParameterizedTest
    @CsvSource({ "3", "6", "9" })
    public void convert_multiples_of_three_to_fizz(int input){
        assertEquals("fizz", new FizzBuzz().convert(input));
    }

    @Test
    public void convert_five_to_buzz(){
        assertEquals("buzz", new FizzBuzz().convert(5));
    }

    @Test
    public void convert_ten_to_buzz(){
        assertEquals("buzz", new FizzBuzz().convert(10));
    }

    @Test
    public void convert_twenty_to_buzz(){
        assertEquals("buzz", new FizzBuzz().convert(20));
    }

}
