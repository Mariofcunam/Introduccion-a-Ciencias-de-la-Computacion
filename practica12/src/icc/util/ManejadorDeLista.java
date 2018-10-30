/* -*- jde -*- */
/* <ManejadorDeLista.java> */

package icc.util;

import icc.agenda.*;
import icc.util.*;

import java.io.FileNotFoundException;
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
	 * Por ahora utilizaremos este método para poder
	 * programar la búsqueda en la base de datos.
	 *@param buscador - objeto buscador para encontrar al registro agenda
	 *@throws FileNotFoundException -- No se encuentra el archivo
	 *@return aux - elemento buscado 
	 */
	public Object encuentra(IBuscador buscador)throws FileNotFoundException {
		// TODO: Utiliza al objeto buscador para encontrar
		// al registro agenda con el dato solicitado.
	    if(this.cabeza==null){
		return null;
	    }
	    Lista aux = cabeza;
	    while(aux!=null){
		if(buscador.esEste(aux.getElemento())){
		    return aux.getElemento();
		}
		aux = aux.getSiguiente();
		
	    }
	    return null;
	}
	
}
