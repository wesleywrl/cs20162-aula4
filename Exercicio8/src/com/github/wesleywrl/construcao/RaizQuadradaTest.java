package com.github.wesleywrl.construcao;

import org.junit.Test;

import static org.junit.Assert.*;


public class RaizQuadradaTest {

    @Test
    public void umCasoTrivial() {
        assertEquals(2,RaizQuadrada.raizQuadrada(4,1));
    }
}