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
public class QuadradoPerfeito {

   public static int quadradoPerfeito(int k){
       int i = 1;
       int q = 1;
       if(k >= 1){
           while(q < k){
               i = i + 2;
               q = q + i;
               
           }
       }
       return q = k;
   }
}
