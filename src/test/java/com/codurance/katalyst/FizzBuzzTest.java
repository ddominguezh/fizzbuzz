package com.codurance.katalyst;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
    
    @Test
    public void convert_one_to_one(){
        assertEquals("1", new FizzBuzz().convert(1));
    }

    @Test
    public void convert_two_to_two(){
        assertEquals("2", new FizzBuzz().convert(2));
    }
}
