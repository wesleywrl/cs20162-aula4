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
public class Fibonacci {

   public static int fibonacci(int n){
       int a = 0;
       int i;
       int c = 1;
       int t;
       if(n == 0 || n == 1){
           return n;
       }
       i = 2;
       while(i <= n){
           t = c;
           c = c + a;
           a = t;
           i = i + 1;
           
       }
       return c;
   }
    
}
