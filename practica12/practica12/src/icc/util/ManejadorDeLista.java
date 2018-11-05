/* -*- jde -*- */
/* <ManejadorDeLista.java> */

package icc.util;

import icc.recursividad.*;
import icc.util.*;


/**
 * Clase para proveer los servicios de un contenedor tipo Lista.
 */
public class ManejadorDeLista {	

    /**
     * Primer elemento de la lista.
     */
    private Lista cabeza;

    /**
     * Número de elementos en la lista.
     */
    private int longitud;

    /**
     * Agrega un registro agenda al final de la lista.
     *@param elemento -- Elemento que sera agregado al final de la lista.
     */
    public void agrega(Object elemento) {
	// Crea el nuevo elemento y lo cuenta.
	Lista nuevo = new Lista(elemento);
	longitud++;

	// Si la lista está vacía añade al primer elemento y termina.
	if (cabeza == null) {
	    cabeza = nuevo;
	    return;
	}

	// Si no, hay que recorrer la lista para formar al nuevo
	// elemento detrás del último.
	Lista anterior = cabeza;
	while(anterior.getSiguiente() != null) {
	    anterior = anterior.getSiguiente();
	}
	anterior.setSiguiente(nuevo); 
    }

    /**
     * Devuelve el número de elementos en esta lista.
     *@return longitud -- numero de los elementos en esta lista.
     */
    public int longitud() {
	return longitud;
    }
    /**
     *Metodo que regresa todo la lista de contactos
     *@return contactList - lista en la que estarna todos los contactos
     */
    public String toString(){
	if(cabeza==null)
	    System.out.println("No hay contactos");
	Lista list = cabeza;
	String contactList = "";
	do{
	    contactList = contactList + list.getElemento() + ",";
	    list = list.getSiguiente();
	}while(list != null);
	return contactList;
    }
	
}
