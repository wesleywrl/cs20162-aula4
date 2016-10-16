package com.github.wesleywrl.construcao;

import org.junit.Test;

import static org.junit.Assert.*;


public class ValordePITest {

    @Test
    public void umCasoTrivial() {
        assertEquals(0, ValordePI.calculodoValorPI(5));
    }
}
