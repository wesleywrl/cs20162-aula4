package com.github.wesleywrl.construcao;

import org.junit.Test;

import static org.junit.Assert.*;


public class FibonacciTest {

    @Test
    public void umCasoTrivial() {
         
        assertEquals(13,Fibonacci.fibonacci(7));
    }
}