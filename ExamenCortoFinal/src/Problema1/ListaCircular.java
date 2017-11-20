/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1;

/**
 *
 * @author fabia
 */
public class ListaCircular<E> {
    
	private static class Node<E>{
		private E element;
		private Node<E> next;
		public Node(E element, Node<E> next) {
			super();
			this.element = element;
			this.next = next;
		}
		public E getElement() {
			return element;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> next) {
			this.next = next;
		}
	}

	private Node<E> tail = null;
	
	private int size = 0;
	
	public int size() {return size;}
	
	public boolean isEmpty() { return size == 0;}
	
	public E first() {
		if (isEmpty()) return null;
		return tail.getNext().getElement();//Primer cambio
	}
	
	public E last() {
		if (isEmpty()) return null;
		return tail.getElement();
	}
	
	public void rotate() {
		if (tail != null)
			tail = tail.getNext();
	}
	
	public void addFirst(E e) {
		
		if(size == 0) {
			tail = new Node<>(e, null);
			tail.setNext(tail);
		}else {
			Node<E> newest = new Node<>(e, tail.getNext());
			tail.setNext(newest);
		}
		size++;
	}
	
	public void addLast(E e) {
		addFirst(e);
		tail = tail.getNext();
	}
	
	public E removeFirst() {
		if(isEmpty()) return null;
		Node<E> head = tail.getNext();
		if(head == tail) tail = null;
		else tail.setNext(head.getNext());
		size--;
		return head.getElement();
	}
        

        
        
        /**
         * Metodo agregado para poder buscar la letra sin eliminar y asi poder correrla
         * @param letra     letra que busca
         * @param distancia distancia de letra a la que se va a correr
         * @return 
         */
        public E encontrar(char letra,int distancia){
            
            String cadena = Character.toString(letra);  //convierte a string
            Node aux = tail.getNext();      //empieza en el inicio
            for (int i = 0; i < size(); i++) {
                String prueba = (String) aux.getElement();  //convierte a string el valor de aux
                 if (cadena.toLowerCase().equals(prueba)) {
                for (int z = 0; z < distancia; z++) {
                    aux=aux.getNext();          //cambia de posicion la letra
                }
                 return (E) aux.getElement();       //devuelve el nuevo valor
                 }
                 else{
                     aux=aux.getNext();     //cambia al siguiente
            }
                
            }
            
            return null;
                        
        }
}

