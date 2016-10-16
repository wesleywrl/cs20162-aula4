package com.github.wesleywrl.construcao;

import org.junit.Test;

import static org.junit.Assert.*;


public class LogaritmoNaturalTest {

    @Test
    public void umCasoTrivial() {
        assertEquals(2,LogaritmoNatural.logaritmoNatural(1,2));
    }
}
