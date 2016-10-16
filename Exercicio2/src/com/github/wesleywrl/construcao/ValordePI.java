/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.wesleywrl.construcao;

/**
 *
 * @author Administrador
 */
public class ValordePI {

    public static int calculodoValorPI(int n){
        int i = 1;
        int s = -1;
        int d = -1;
        int p = 0;
        if(n <= 1){
            while(i <= n){
                d = d + 2;
                s = -1 * s;
                p = p + 4 * (s/d);
                i = i + 1;
            }
        }
        return p;
    }

    public static Object calculodoValorPI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
