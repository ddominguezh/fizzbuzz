package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzExtendedTest {
    
    @Test
    public void convert_one_to_one(){
        assertEquals("1", new FizzBuzzExtended().convert(1));
    }

    @Test
    public void convert_two_to_two(){
        assertEquals("2", new FizzBuzzExtended().convert(2));
    }

    @Test
    public void convert_four_to_four(){
        assertEquals("4", new FizzBuzzExtended().convert(4));
    }
}
