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

    @ParameterizedTest
    @CsvSource({ "6", "9", "12" })
    public void convert_multiples_of_three_and_not_content_number_three_to_fizz(int input){
        assertEquals("fizz", new FizzBuzzExtended().convert(input));
    }

    @ParameterizedTest
    @CsvSource({ "3,fizzfizz", "33,fizzfizzfizz", "333,fizzfizzfizzfizz" })
    public void convert_multiples_of_three_and_content_number_three_to_fizz(int input, String expected){
        assertEquals(expected, new FizzBuzzExtended().convert(input));
    }

    @Test
    public void convert_five_to_buzzbuzz(){
        assertEquals("buzzbuzz", new FizzBuzzExtended().convert(5));
    }
}
