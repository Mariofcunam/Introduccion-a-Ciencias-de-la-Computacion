/* -*- jde -*- */
/* <ListaAgenda.java> */

package icc.util;

import icc.recursividad.*;
import icc.util.*;
/**
 * Clase para proveer los servicios de un contenedor tipo Lista.
 */
public class Lista {	

    /**
     * Registro almacenado.
     */
    private Object elemento;

    /**
     * Lista siguiente.
     */
    private Lista siguiente;

    /**
     * Construye una lista con un único elemento.
     * @param elemento: el elemento a almacenar.
     *  Debe ser distinto de <code>null</code>.
     */
    Lista(Object elemento) {
	this.elemento = elemento;
	}

    /**
     * Devuelve el elemento almacenado en esta lista.
     *@return elemento - Elemento del registro de la agenda.
     */
    public Object getElemento() {
	return elemento;
    }
  
    /**
     * Devuelve la lista siguiente.
     *@return siguiente - Elemento siguiente de la agenda.
     */
    public Lista getSiguiente() {
	return siguiente;
    }

    /**
     * Asigna a la lista que va después de esta.
     * @param siguiente: otra lista.
     */
    public void setSiguiente(Lista siguiente) {
	this.siguiente = siguiente;
    }
	
}
