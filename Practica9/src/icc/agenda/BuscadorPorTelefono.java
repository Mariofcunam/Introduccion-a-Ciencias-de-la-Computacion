/* -*- jde -*- */
/* <BuscadorPorNombre.java> */

package icc.agenda;

import icc.util.*;
import icc.agenda.*;

/**
 * Clase que busca registros agenda con un nombre dado.
 */
public class BuscadorPorTelefono implements IBuscador {

	/* Telefono que se busca */
	private int  telefonoBuscado;

	/**
	 * Construye al buscador con el telefono que
	 * va a buscar.
	 *@param telefono - telefono que sera buscado
	 */
	public BuscadorPorTelefono(int telefono) {
		telefonoBuscado = telefono;
	}

	/**
	 * Método que indica si el objeto pasado como parámetro
	 * es el que se está buscando.
	 * @param reg Registro que se desea saber si corresponde
	 *        al nombre buscado.
	 * @return si <code>reg</code> tiene ese nombre.
	 */
	public boolean esEste(RegistroAgenda reg) {
	    return reg.getTelefono()==telefonoBuscado;
	}

}
