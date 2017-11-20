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
public class Octagono implements Poligono {
 
      private double longitud;
    private double apotema;

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
    
    
    
    @Override
    public double area() {
      return (8*longitud)*apotema/2;
    }

    @Override
    public double perimetro() {
        return 8*longitud;
    }
}
