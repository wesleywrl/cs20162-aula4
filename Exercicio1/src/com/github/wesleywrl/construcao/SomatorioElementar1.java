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
public class SomatorioElementar1 {

 public static int somaElementar(int n){
     int i = 1;
     int s = 0;
     
     while(i <= n){
         int d;
         d = 1 + (i*i);
         s = s + 1/d;
         i = i + i;
     }
     return s;
 }
}
