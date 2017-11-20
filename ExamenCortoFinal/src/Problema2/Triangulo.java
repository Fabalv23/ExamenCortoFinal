/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema2;
import java.util.*;
/**
 *
 * @author fabia bases para usar con sus derivados
 */
public class Triangulo implements Poligono{

    private double lado1;
    private double lado2;
    private double base;
/**
 * Constructor
 * @param l1
 * @param l2
 * @param l3 
 */
    public Triangulo(double l1,double l2,double l3){
        this.base=l3;
        this.lado1=l1;
        this.lado2=l2;
    }
    
    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

   
    
    @Override
    public double area() {
        double res = Math.sqrt((lado1*lado1)-((base/2)*(base/2)));
        return res;
    }

    @Override
    public double perimetro() {
        return lado1+lado2+base;
    }
    
}
