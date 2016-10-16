package com.github.wesleywrl.construcao;

import org.junit.Test;

import static org.junit.Assert.*;


public class FatorialTest {

    @Test
    public void umCasoTrivial() {
        assertEquals(6, Fatorial.Nfatorial(3));
    }
}
