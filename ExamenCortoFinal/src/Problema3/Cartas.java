/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema3;

/**
 *
 * @author fabia api del problema 3
 */
public class Cartas {
    
    //Variables y listas
    public String valor;
    public String categoria;
    ListaPosicional<Cartas> corazones = new ListaPosicional<>();
    ListaPosicional<Cartas> espadas = new ListaPosicional<>();
    ListaPosicional<Cartas> treboles = new ListaPosicional<>();
    ListaPosicional<Cartas> diamantes = new ListaPosicional<>();
    ListaPosicional<Cartas> aleatorias = new ListaPosicional<>();
    Position ca1;
    Position aux;

    /**
     * Llena las lista con esas cartas
     */
    public void llenar() {

        aux = aleatorias.addFirst(agregarCarta("2", "Comodin"));
        aleatorias.addLast(agregarCarta("1", "Comodin"));
        aleatorias.addLast(agregarCarta("5", "Comodin"));
        aleatorias.addLast(agregarCarta("8", "Comodin"));

        corazones.addFirst(agregarCarta("2", "corazones"));
        corazones.addLast(agregarCarta("1", "corazones"));

        espadas.addFirst(agregarCarta("4", "espadas"));
        espadas.addLast(agregarCarta("K", "espadas"));

        treboles.addFirst(agregarCarta("4", "treboles"));
        treboles.addLast(agregarCarta("3", "treboles"));

        diamantes.addFirst(agregarCarta("6", "diamantes"));
        diamantes.addLast(agregarCarta("1", "diamantes"));
    }
/**
 * Agrega las cartas con su respectivo valor 
 * @param va
 * @param ca
 * @return 
 */
    public Cartas agregarCarta(String va, String ca) {
        Cartas c1 = new Cartas();
        c1.valor = va;
        c1.categoria = ca;

        return c1;
    }
/**
 * Da a elegir la categoria que desea jugar, si se acaba saca cualquiera otra y si no hay solo indica que no hay
 * @param Categoria
 * @return 
 */
    public String Jugar(String Categoria) {

        switch (Categoria) {
            case "corazones":
                if (!corazones.isEmpty()) {
                    ca1 = corazones.last();
                    return corazones.remove(ca1).ToString();
                } 

            case "espadas":
                if (!espadas.isEmpty()) {
                    ca1 = espadas.last();
                    return espadas.remove(ca1).ToString();
                } 

            case "treboles":
                if (!treboles.isEmpty()) {
                    ca1 = treboles.last();
                    return treboles.remove(ca1).ToString();
                } 

            case "diamantes":
                if (!diamantes.isEmpty()) {
                    ca1 = diamantes.last();
                    return diamantes.remove(ca1).ToString();
                }
            default:
                return "Categoria Invalida o no tiene cartas";
        }

    }
/**
 * para pasar todos los valores bien en un string
 * @return 
 */
    public String ToString() {
        return "Carta valor " + valor + " Categoria de " + categoria;
    }

}
