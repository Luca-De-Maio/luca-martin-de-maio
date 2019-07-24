package com.mycompany.topic1;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {


    @Test
    public void test(){
        int result = Calculator.suma(2, 4);
        int expected = 6 ;
        assertEquals(expected, result);

    }

    @Test
    public void test2(){
        int result = Calculator.suma(2, 4);
        int expected = 6 ;
        assertEquals(expected, result);

    }
}
