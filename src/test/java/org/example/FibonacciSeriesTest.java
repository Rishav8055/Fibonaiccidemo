package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSeriesTest {
     FibonacciSeries seriesTest;
    @BeforeEach
    void setup(){
        seriesTest=new FibonacciSeries();
    }
    @AfterEach
    void tearDown(){
        seriesTest=null;
    }


    @Test
    void calculateFibonacciNumber() {
        assertEquals(34,seriesTest.calculateFibonacciNumber(9));

    }
}