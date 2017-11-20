/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema2;

/**
 *
 * @author fabia
 */
public class FabricaFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//Creacion de todas las figuras desde la interfaz de poligono
        
        
        
        Poligono c1 = new Cuadrado(15, 25);
        System.out.println(c1.area());
        System.out.println(c1.perimetro());

        Poligono t2 = new TrianguloEquilatero(15);
        System.out.println(t2.area());
        System.out.println(t2.perimetro());

        Poligono t1 = new TrianguloIsoceles(15, 25);
        System.out.println(t1.area());
        System.out.println(t1.perimetro());

        Poligono h1 = new Hexagono(15, 25);
        System.out.println(h1.area());
        System.out.println(h1.perimetro());

    }

}
