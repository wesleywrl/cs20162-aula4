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
public class LogaritmoNatural {

   public static int logaritmoNatural(int n ,int k){
     int i = 2;
     int e = n + 1;
     int p;
     int f = 1;
       if(n >= 1 && k >= 2){
           while(i <= k){
               p = (int) Math.pow(n,i);
               f = f * i;
               e = e + p/f;
               i = i + 1;
               
           }
        
    }
       return e;
}
    
}
