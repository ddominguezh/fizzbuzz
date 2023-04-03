package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzExtendedTest {
    
    @Test
    public void convert_one_to_one(){
        assertEquals("1", new FizzBuzzExtended().convert(1));
    }
}
