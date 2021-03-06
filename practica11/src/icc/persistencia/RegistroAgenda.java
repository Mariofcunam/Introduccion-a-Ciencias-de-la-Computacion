/* -*- jde -*- */
/* <RegistroAgenda.java> */

package icc.persistencia;


/**
 * Registro para una Agenda
 */
public class RegistroAgenda {
    private String nombre;
    private String direccion;
    private int telefono;

	// TODO: Declara aquí los atributos para almacenar
	// nombre, dirección y teléfono.

	/**
	 * Constructor.
	 *@param nombre -- nombre del contacto en la  agenda.
	 *@param direccion -- direccion del contacto en la agenda.
	 *@param telefono  -- telefono del contacto en la agenda.
	 */
    public RegistroAgenda(String nombre, String direccion, int telefono){
	this.nombre=nombre;
	this.direccion=direccion;
	this.telefono=telefono;
    }
    /**
     *Constructor por omision 
     */
    public RegistroAgenda(){
	this(null,null,0);
    }

    /**
     * Agrega los getters necesarios para leer la información en el registro.
     */

    /**
     *Metodo para obtener el nombre del contacto en la agenda
     *@return this.nombre -- nombre del contacto en la agenda
     */
    public String getNombre(){
	return this.nombre;
    }
    /**
     *Metodo para obtener direccion
     *@return this.direccion - direccion del contacto en la agenda
     */ 
    public String getDireccion(){
	return this.direccion;
    }
    /**
     *Metodo para obtener el telefono
     *@return this.telefono - telefono del contacto en la agenda
     */
    public int getTelefono(){
	return this.telefono;
    }

    /**
     * Agrega los setters que permitan actualizar los datos de tu contacto.
     */

    /**
     *Metodo para asignar nombre del contacto en la agenda
     *@param nombre - nombre del contacto en la agenda
     */
    public void setNombre(String nombre){
	this.nombre = nombre;
    }
    /**
     *Metodo para asignar direcccion del contacto en la agenda
     *@param direccion - direccion del contacto en la ageda
     */
    public void setDireccion(String direccion){
	this.direccion=direccion;
    }
    /**
     *Metodo para asignar telefono  del contacto en la agenda
     *@param telefono - telefono del contacto en la agenda
     */
    public void setTelefono(int telefono){
	this.telefono=telefono;
    }
    /**
     * Devuelve una cadena con los datos en el registro en un formato agradable.
     *@return String - Datos del registro en formato en cadena.
     */
	public String toString() {
		return this.nombre + " | " + this.direccion + " | " + this.telefono;
	}
}
