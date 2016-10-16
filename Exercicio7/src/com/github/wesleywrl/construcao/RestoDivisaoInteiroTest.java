package com.github.wesleywrl.construcao;

import org.junit.Test;

import static org.junit.Assert.*;


public class RestoDivisaoInteiroTest {

    @Test
    public void umCasoTrivial() {
        assertEquals(2,RestoDivisaoInteiro.restoDivisao(5,3));
    }
}