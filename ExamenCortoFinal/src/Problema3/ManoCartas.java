/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema3;

import java.util.Random;

/**
 *
 * @author fabia resolucion a problema 3
 */
public class ManoCartas {

   
   
        /**
         * para poder jugar con las manos de la cartas
         * @param args 
         */
    public static void main(String[] args) {
Cartas c1 = new Cartas();
c1.llenar();
//Juega con las disponibles
      System.out.println(c1.Jugar("espadas"));      
      System.out.println(c1.Jugar("espadas"));
      System.out.println(c1.Jugar("espadas"));

    }

    
}
