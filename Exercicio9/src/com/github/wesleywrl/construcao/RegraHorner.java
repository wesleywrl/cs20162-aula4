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
public class RegraHorner {

    public static int regraHornerPolinomio(int x, int g, int [] a){
        int p = a[g];
        int i = g - 1;
        if(g >= 1){
            while(i >= 0){
                p = p * x + a[i];
                i = i - 1;
                
            }
            
            
        }
        return p;
    }
    
}
