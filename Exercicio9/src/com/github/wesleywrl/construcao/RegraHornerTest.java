package com.github.wesleywrl.construcao;

import org.junit.Test;

import static org.junit.Assert.*;


public class RegraHornerTest {

    @Test
    public void umCasoTrivial() {
         int[] a = {4, 3, 2, 1};
        assertEquals(10,RegraHorner.regraHornerPolinomio(1,3,a));
    }
}