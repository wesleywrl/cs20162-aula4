/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.wesleywrl.construcao;

/**
 *
 * @author Wesley Ramos
 */
public class Fatorial {

    public static int Nfatorial(int n){
        int i = 2;
        int f = 1;
        if(n >= 1){
            while(i <= n){
                f = f * i;
                i = i + 1;
            }
            
        }
        return f;
        
    }
}
