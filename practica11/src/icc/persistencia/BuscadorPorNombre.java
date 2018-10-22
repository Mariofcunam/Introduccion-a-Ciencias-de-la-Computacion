/* -*- jde -*- */
/* <BuscadorPorNombre.java> */

package icc.persistencia;

/**
 * Clase que busca registros agenda con un nombre dado.
 */
public class BuscadorPorNombre implements IBuscador {

	/* Nombre que se busca */
	private String nombreBuscado;

	/**
	 * Construye al buscador con el nombre que
	 * va a buscar.
	 *@param nombre - nombre que sera buscado.
	 */
	public BuscadorPorNombre(String nombre) {
		nombreBuscado = nombre;
	}

	/**
	 * Método que indica si el objeto pasado como parámetro
	 * es el que se está buscando.
	 * @param reg Registro que se desea saber si corresponde
	 *        al nombre buscado.
	 * @return si <code>reg</code> tiene ese nombre.
	 */
	public boolean esEste(Object reg) {
	    RegistroAgenda auxN = (RegistroAgenda) reg; 
	    return auxN.getNombre().equals(nombreBuscado);
	}

}
