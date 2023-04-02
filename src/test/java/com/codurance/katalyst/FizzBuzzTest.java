package com.codurance.katalyst;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
    
    @Test
    public void convert_one_to_one(){
        assertEquals("1", new FizzBuzz().convert(1));
    }
}
