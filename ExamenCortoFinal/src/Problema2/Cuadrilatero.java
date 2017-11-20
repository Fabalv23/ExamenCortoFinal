/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema2;

/**
 *
 * @author fabia     caracteristicas basicas de un cuadrado
 */
public class Cuadrilatero implements Poligono {
    private double base;
    private double altura;

   public Cuadrilatero(double b,double a){
       this.base=b;
       this.altura=a;
   }
    
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
       return base*altura;
    }

    @Override
    public double perimetro() {
        return (base*2)+(altura*2);
    }
    
    
    
    
}
