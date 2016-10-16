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
public class RaizQuadrada {

   public static int raizQuadrada(int n,int i){
       int r = 1;
       if(n > 0){
           while(0 <= i){
               r = (r + (n/r))/2;
               i = i - 1;
           }
       }
       return r;
   }
    
}
