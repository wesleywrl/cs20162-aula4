package com.github.wesleywrl.construcao;

import org.junit.Test;

import static org.junit.Assert.*;


public class QuadradoPerfeitoTest {

    @Test
    public void umCasoTrivial() {
        assertEquals(4,QuadradoPerfeito.quadradoPerfeito(4));
    }
}