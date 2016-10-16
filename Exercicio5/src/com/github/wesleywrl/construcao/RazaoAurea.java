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
public class RazaoAurea {
  public static int razaoAurea(int x, int y, int k){
      int t;
      int c = y;
      int a = x;
      int i = 1;
      if(x >= 0 && x < y && k > 0){
          while(i <= k){
              t = c;
              c = c + a;
              a = t;
              i = i + 1;
          }
      }
      return c/a;
  }
}
