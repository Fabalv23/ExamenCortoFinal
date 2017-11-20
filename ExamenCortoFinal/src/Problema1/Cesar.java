/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1;

import java.util.Scanner;

/**
 *
 * @author fabia para cifrar un mensaje
 */
public class Cesar {

    /**
     * Para evaluar la funcionalidad de la implementacion
     * @param args 
     */
    public static void main(String[] args) {
       

        System.out.println(cifrarCesar("Hola Mundo",3));
        System.out.println(cifrarCesar("Hola Mundo","Gallego",3));
        
    }
/**
 * intentara hacer el cifrado dependiendo de la distancia que el usuario ingrese
 * @param frase     frase a traducir
 * @param distancia distancia de letras a cambiar
 * @return 
 */
    public static String cifrarCesar(String frase, int distancia) {
//Creacion de la lista con el abc
        ListaCircular<String> espanol = new ListaCircular<>();
        espanol.addFirst("a");
        espanol.addLast("b");
        espanol.addLast("c");
        espanol.addLast("d");
        espanol.addLast("e");
        espanol.addLast("f");
        espanol.addLast("g");
        espanol.addLast("h");
        espanol.addLast("i");
        espanol.addLast("j");
        espanol.addLast("k");
        espanol.addLast("l");
        espanol.addLast("m");
        espanol.addLast("n");
        espanol.addLast("o");
        espanol.addLast("p");
        espanol.addLast("q");
        espanol.addLast("r");
        espanol.addLast("s");
        espanol.addLast("t");
        espanol.addLast("u");
        espanol.addLast("v");
        espanol.addLast("w");
        espanol.addLast("x");
        espanol.addLast("y");
        espanol.addLast("z");
        
        StringBuilder nuevo = new StringBuilder();  //para juntar todos los caracteres
        
        for (int i = 0; i < frase.length(); i++) {
            
            char letra = frase.charAt(i);       //obtiene caracter por caracter
           
            if (letra!=' ') {
                nuevo.append(espanol.encontrar(letra, distancia));      //busca la letra y la cambia
            }else{
                nuevo.append(" ");      //deja el espacio por si hay
            }        
        }
             
        return nuevo.toString();        //devuelve la frase nueva

    }
/**
 * La misma funcionanlidad que la de arriba solo que en este el usuario indica que alfabeto desea usar
 * @param frase     frase a cifrar
 * @param alfabeto  alfabeto a usar
 * @param distancia distancia a correr los caracteres
 * @return 
 */
    public static String cifrarCesar(String frase, String alfabeto, int distancia) {

        if (alfabeto=="Espanol") {
            return cifrarCesar(frase,distancia);
        }else{
            //Misma anterior solo que aqui se incluye la ñ
            ListaCircular<String> otro = new ListaCircular<>();
        otro.addFirst("a");
        otro.addLast("b");
        otro.addLast("c");
        otro.addLast("d");
        otro.addLast("e");
        otro.addLast("f");
        otro.addLast("g");
        otro.addLast("h");
        otro.addLast("i");
        otro.addLast("j");
        otro.addLast("k");
        otro.addLast("l");
        otro.addLast("m");
        otro.addLast("n");
        otro.addLast("ñ");
        otro.addLast("o");
        otro.addLast("p");
        otro.addLast("q");
        otro.addLast("r");
        otro.addLast("s");
        otro.addLast("t");
        otro.addLast("u");
        otro.addLast("v");
        otro.addLast("w");
        otro.addLast("x");
        otro.addLast("y");
        otro.addLast("z");
        
        StringBuilder nuevo = new StringBuilder();
        
        for (int i = 0; i < frase.length(); i++) {
            
            char letra = frase.charAt(i);
           
            if (letra!=' ') {
                nuevo.append(otro.encontrar(letra, distancia));
            }else{
                nuevo.append(" ");
            }        
        }        
        return nuevo.toString();
        
        }          
    }
}
