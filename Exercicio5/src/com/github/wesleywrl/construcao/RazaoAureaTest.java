package com.github.wesleywrl.construcao;

import org.junit.Test;

import static org.junit.Assert.*;


public class RazaoAureaTest {

    @Test
    public void umCasoTrivial() {
        assertEquals(1,RazaoAurea.razaoAurea(1,2,1));
    }
}